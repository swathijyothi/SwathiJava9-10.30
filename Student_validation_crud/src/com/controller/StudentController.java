package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			response.sendRedirect("show.jsp");
		}
		if(action.equalsIgnoreCase("edit")) {
			int id=Integer.parseInt(request.getParameter("id"));
		Student s=	StudentDao.getStudentById(id);
			request.setAttribute("s", s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
			
		}
		if(action.equalsIgnoreCase("update")) {
			Student s=new Student();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			s.setGender(request.getParameter("gender"));
			s.setPassword(request.getParameter("password"));
			StudentDao.updateStudent(s);
			response.sendRedirect("show.jsp");
			
		}
		if(action.equalsIgnoreCase("delete")) {
			int id=Integer.parseInt(request.getParameter("id"));
		Student s=	StudentDao.deleteStudent(id);
			request.setAttribute("s", s);
			request.getRequestDispatcher("delete.jsp").forward(request, response);
		}
	}

}
