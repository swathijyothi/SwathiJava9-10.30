package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.StudentDao;
import com.bean.Address;
import com.bean.Student;

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
			s.setSname(request.getParameter("sname"));
			StudentDao.insertStudent(s);
			Address a=new Address();
			a.setStreet(request.getParameter("street"));
			a.setCity(request.getParameter("city"));
			a.setState(request.getParameter("state"));
			a.setZip_code(Long.parseLong(request.getParameter("zcode")));
			a.setSid(s);
			StudentDao.insertAddress(a);
			response.sendRedirect("student.jsp");
		}
	}

}
