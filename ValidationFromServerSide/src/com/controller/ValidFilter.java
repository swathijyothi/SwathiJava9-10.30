package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidFilter
 */
@WebServlet("/ValidFilter")
public class ValidFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fn =request.getParameter("fname");
		String ln=request.getParameter("lname");
		String e=request.getParameter("email");
		String m=request.getParameter("mobile");
		String p=request.getParameter("password");
	}

}
