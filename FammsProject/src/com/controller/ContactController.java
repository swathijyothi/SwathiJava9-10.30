package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Contact;
import com.dao.ContactDao;

/**
 * Servlet implementation class ContactController
 */
@WebServlet("/ContactController")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("submit")) {
			Contact c=new Contact();
			c.setFname(request.getParameter("fname"));
			c.setEmail(request.getParameter("email"));
			c.setSubject(request.getParameter("subject"));
			c.setMessage(request.getParameter("message"));
			ContactDao.insertContact(c);
	  request.setAttribute("msg", "contact added successfully");
	  request.getRequestDispatcher("contact.jsp").forward(request, response);
		}
	}

}
