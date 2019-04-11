package com.pluralsight;

import java.io.IOException;
import java.io.PrintWriter;

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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    // 20190329 added printwriter object, title
		// 20190408 added BookForm.html and form reader
		// 20190409 moved all the code to the doPost method

//		request.setAttribute("book_title","1984");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("BookList.jsp");
//		dispatcher.forward(request, response);
		
		
		PrintWriter output = response.getWriter();
		output.println("hello controller servlet again and again");
		request.setAttribute("book_title","1984 julie again and again");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookList.jsp");
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
		
		output.println("Book Title 4/08:  " + title);
		output.println("<br/>");
		output.println("Book Author 4/08:  " + author);
	
	}

}
