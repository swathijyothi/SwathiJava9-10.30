package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Address;
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
			Address a=new Address();
			a.setStreet(request.getParameter("street"));
			a.setCity(request.getParameter("city"));
			a.setState(request.getParameter("state"));
			a.setZipcode(Long.parseLong(request.getParameter("zcode")));
			
			StudentDao.insertAddress(a);
			Student s=new Student();
			s.setSname(request.getParameter("sname"));
			s.setAid(a);
			StudentDao.insertStudent(s);
			response.sendRedirect("show.jsp");
		}
		if(action.equalsIgnoreCase("delete")) {
			int aid=Integer.parseInt(request.getParameter("aid"));
			StudentDao.deleteStudent(aid);
			response.sendRedirect("show.jsp");
			
		}
		if(action.equalsIgnoreCase("edit")) {
			int aid=Integer.parseInt(request.getParameter("aid"));
		
			Address a=StudentDao.getAddressById(aid);
			request.setAttribute("a", a);
	
			
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		if(action.equalsIgnoreCase("update")) {
			Address a=new Address();
			
			a.setAid(Integer.parseInt(request.getParameter("aid")));
			a.setStreet(request.getParameter("street"));
			a.setCity(request.getParameter("city"));
			a.setState(request.getParameter("state"));
			a.setZipcode(Long.parseLong(request.getParameter("zcode")));
			
			StudentDao.updateAddress(a);;
			Student s=new Student();
			s.setSname(request.getParameter("sname"));
			
			StudentDao.updateStudent(s);;
			response.sendRedirect("show.jsp");
		}
		}
	}


