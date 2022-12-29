package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.bo.EmpBo;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		EmpBo ebo=(EmpBo) a.getBean("empBo");
		
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("insert")) {
			
			Employee e=new Employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			ebo.insertEmp(e);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("edit")) {
			int id= Integer.parseInt(request.getParameter("id"));
			Employee  e= ebo.getEmpById(id);
			request.setAttribute("e", e);
			request.getRequestDispatcher("update.jsp").forward(request, response);
			
			
		}
		else if(action.equalsIgnoreCase("delete")){
			
			int id=Integer.parseInt(request.getParameter("id"));
			Employee e=ebo.getEmpById(id);
			response.sendRedirect("show.jsp");
			
			
		}
	}

}
