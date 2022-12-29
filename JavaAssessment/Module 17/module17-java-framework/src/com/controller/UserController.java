package com.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.bean.User;
import com.bo.UserBo;

import com.service.Services;

import sun.security.util.Password;

@Controller
public class UserController {
	
	ApplicationContext a= new ClassPathXmlApplicationContext("Beans.xml");
	UserBo ub=(UserBo) a.getBean("userBo");
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String signup() {
		return "signup";
	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	@RequestMapping(value="forgotpassword",method=RequestMethod.GET)
	public String forgotpassword() {
		return "forgotpassword";
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
		u.setImage(request.getParameter("image"));
		
	ub.inserUser(u);
		request.setAttribute("u", u);
	return "login";
	}
	
	
	@RequestMapping(value="/login",method = RequestMethod.POST)	
public String login(HttpServletRequest request,HttpServletRequest response) {
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		User u=new User();
		u=ub.UserByEmail(email, pass);
		if(u==null) {
			
			request.setAttribute("msg", "Invalid Email/Password......!");
			return "login";
		}else {
			request.setAttribute("u", u);
			return "profile";
		}

	}
	@RequestMapping(value="/saveprofile",method = RequestMethod.POST)
    public String update(HttpServletRequest request,HttpServletRequest response) 
	{
	
		User u=new User();
		u.setId(Integer.parseInt(request.getParameter("id")));
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		u.setEmail(request.getParameter("email"));
		u.setPassword(request.getParameter("password"));
		u.setCpassword(request.getParameter("cpassword"));
		u.setImage(request.getParameter("image"));
		
	ub.inserUser(u);
		request.setAttribute("u", u);
	return "login";
	}
	@RequestMapping(value="/forgotpassword",method = RequestMethod.POST)
    public String forgotpassword(HttpServletRequest request,HttpServletRequest response) {
		String email=request.getParameter("email");
		
		int min=1000;
		int max=9999;
		int otp=(int)Math.floor(Math.random()*(max-min+1)+min);
		Services.sendMail(email, otp);
		request.setAttribute("email", email);
		request.setAttribute("otp", otp);
		request.setAttribute("msg", "OTP send Successfully");
		return "otp";
		
		}
	
	@RequestMapping(value="/otp",method = RequestMethod.POST)
  public String otp(HttpServletRequest request,HttpServletRequest response) 
		{
			String email=	request.getParameter("email");
			int otp1=Integer.parseInt(request.getParameter("otp1"));
			int otp2=Integer.parseInt(request.getParameter("otp2"));
			if(otp1==otp2)
			{
				request.setAttribute("email", email);
			return "newpassword";
				
				
			}else {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg", "Invalid OTP");
				return "otp";
			}
			}
		@RequestMapping(value="/newpassword",method = RequestMethod.POST)
		  public String newpassword(HttpServletRequest request,HttpServletRequest response) {
			
			String email=request.getParameter("email");
			String np=request.getParameter("newpassword");
			String cnp=request.getParameter("cnewpassword");
			if(np.equals(cnp)) 
			{
				ub.ChangePassword(email, np);
				return "login";
			}
			else {
				request.setAttribute("email", email);
				request.setAttribute("msg", "New password and confirm password does not match");
				return "newpassword";
				
			}
		}
		@RequestMapping(value="logout",method=RequestMethod.GET)
		public String logout() {
			return "login";
		}
		
}	
