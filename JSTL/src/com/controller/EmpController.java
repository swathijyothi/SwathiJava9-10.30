package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.EmpDao;
import com.bean.Employee;


/**
 * Servlet implementation class EmpController
 */
@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("insert")) {
			Employee e=new Employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			
			EmpDao.insertEmployee(e);
			response.sendRedirect("profilepage.jsp");
			
		}
		else if(action.equalsIgnoreCase("Edit")) {
			int id=Integer.parseInt(request.getParameter("id"));
			Employee e = EmpDao.getEmployeeById(id);
			request.setAttribute("employees", e);
			request.getRequestDispatcher("updatepage.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("delete")) {
			int id=Integer.parseInt(request.getParameter("id"));
			EmpDao.deleteEmployee(id);
			response.sendRedirect("profilepage.jsp");
		}
		else if(action.equalsIgnoreCase("update")) {
			Employee e=new Employee();
			e.setId(Integer.parseInt(request.getParameter("id")));
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			
			EmpDao.updateEmployee(e);
			response.sendRedirect("profilepage.jsp");
		}
	}

}
