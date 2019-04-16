package com.pluralsight;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***********************************************************************************/
/*                                                                                 */
/* 20190329 started Java:  Creating a Basic Web App                                */
/*                                                                                 */
/***********************************************************************************/

/**
 * Servlet implementation class ControllerServlet
 */

/* 20190329 remove WebServlet identifier and stick it in web.xml file instead      */
//@WebServlet("/ControllerServlet")

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
	/* 20190411 Add array list to print out list of books              */
	//private ArrayList<String> bookTitles = new ArrayList<String>();
	
	/* 20190411 Changed array to Book class                           */
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 5.50f));
        bookList.add(new Book("1984", "George Orwell", 4.50f));
        bookList.add(new Book("Frankenstein", "Mary Shelley", 4.00f));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    // 20190329 added printwriter object, title
		
		//PrintWriter output = response.getWriter();
		//output.println("hello controller servlet again and again");
		
		// 20190408 added BookForm.html and form reader
		// 20190409 moved all the code to the doPost method
		
		// 20190410 added the dispatcher and the /BookList.jsp call
		//request.setAttribute("book_title","1984 julie again and again and yet again");
		
		// 20190411 added the arraylist
		//request.setAttribute("book_titles", bookTitles);
		
		// 20190411 change the arraylist to the Book class
		//request.setAttribute("book_list", bookList);		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("/BookList.jsp");
		//dispatcher.forward(request, response);
	
		// 20190412 added the logic for the links
		String action = request.getPathInfo();
		if (action.contentEquals("/new")) {
			addBook(request, response);
		}
		else {
			listBooks(request, response);
		}
			
		
	}

	private void listBooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("book_list", bookList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookList.jsp");
		dispatcher.forward(request, response);
		
	}

	private void addBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookForm.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter output = response.getWriter();
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		
		output.println("Book Title:  " + title);
		output.println("<br/>");
		output.println("Book Author:  " + author);
	
	}

}
