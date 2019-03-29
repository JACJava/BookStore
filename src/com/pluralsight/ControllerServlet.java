package com.pluralsight;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		
		// stopped at Getting Data into a Servlet from a form
		
		PrintWriter output = response.getWriter();
		
		String title = request.getParameter("title");
		
		output.println("Book Title:  " + title);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
