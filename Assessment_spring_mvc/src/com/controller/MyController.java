package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.User;
import com.bo.UserBo;

@Controller
public class MyController {
	ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
	UserBo ubo= (UserBo)a.getBean("userBo");
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
 
	@RequestMapping(value="/signup",method = RequestMethod.POST)
    public String insert(HttpServletRequest request,HttpServletRequest response) 
	{
		User u=new User();
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		u.setEmail(request.getParameter("email"));
		u.setPassword(request.getParameter("password"));
		u.setCpassword(request.getParameter("cpassword"));
		ubo.insertUser(u);
		
	return "login";
	
}
}
