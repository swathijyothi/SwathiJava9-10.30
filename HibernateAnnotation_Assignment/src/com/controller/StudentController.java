package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Student;
import com.dao.StudentDao;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("insert")) {
			Student s=new Student();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			s.setGender(request.getParameter("gender"));
			s.setPassword(request.getParameter("password"));
			StudentDao.insertStudent(s);
			response.sendRedirect("login.jsp");
		}
		if(action.equalsIgnoreCase("login")) {
			boolean flag=false;
			Student s=StudentDao.StudentLogin(request.getParameter("email"), request.getParameter("password"));
			if(flag==false) {
				request.setAttribute("msg", "Incorrect Email/Password");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else {
				if(s.getEmail().equals("email")) 
				{
					
					request.setAttribute("s",s);
					request.getRequestDispatcher("profile.jsp").forward(request, response);	
				}
				else {
					request.setAttribute("s", s);
					request.getRequestDispatcher("login.jsp").forward(request, response);	
				}
				
			}
		}
	}

}
