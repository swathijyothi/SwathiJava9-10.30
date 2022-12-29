package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String email,Driver;
    ServletConfig config;
    ServletContext context;
    
    
 
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init called");
		this.config=config;
		this.context=config.getServletContext();
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service Called");
		email=config.getInitParameter("email");
		System.out.println("Email:"+email);
		Driver =context.getInitParameter("Driver");
		System.out.println(Driver);
		
	}

	 
		public void destroy() {
			System.out.println("Destroy called");
		}    
   

}
