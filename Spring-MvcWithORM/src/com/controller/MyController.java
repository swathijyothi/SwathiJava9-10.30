package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Employee;
import com.bo.EmpBo;

@Controller
public class MyController {
	
	ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
	EmpBo ebo=(EmpBo) a.getBean("empBo");
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
 
	@RequestMapping(value="/insert",method = RequestMethod.POST)
    public String insert(HttpServletRequest request,HttpServletRequest response) 
	{
		Employee e=new Employee();
		e.setFname(request.getParameter("fname"));
		e.setLname(request.getParameter("lname"));
		e.setEmail(request.getParameter("email"));
		ebo.insert(e);
		
	return "show";
	
}
}
