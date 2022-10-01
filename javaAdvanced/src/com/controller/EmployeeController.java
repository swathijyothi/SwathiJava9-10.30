package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("action");
		System.out.println("insert");
		if(action.equalsIgnoreCase("register")) {
			System.out.println(request.getParameter("fname"));
			System.out.println(request.getParameter("lname"));
			System.out.println(request.getParameter("email"));
			System.out.println(request.getParameter("mobile"));
			System.out.println(request.getParameter("gender"));
			System.out.println(request.getParameter("address"));
		}
	}

}
