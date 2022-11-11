package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.User;
import com.dao.UserDao;
import com.service.Services;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		
		
		
		if(action.equalsIgnoreCase("SignUp")) {
			boolean flag=UserDao.checkEmail(request.getParameter("email"));
			if(flag==true) {
				request.setAttribute("msg", "Email Already exit");
				 request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
			else if(request.getParameter("password").equals(request.getParameter("cpassword")))
			{	
			User u=new User();
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			u.setPassword(request.getParameter("password"));
			u.setCpassword(request.getParameter("cpassword"));
			u.setGender(request.getParameter("gender"));
			u.setAddress(request.getParameter("address"));
			u.setUsertype(request.getParameter("usertype"));
			UserDao.UserSignUp(u);
			request.setAttribute("msg", "SignUp successfully !");
			  request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
			else
			{
				request.setAttribute("msg", "password and confirm password not same");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("login")) 
		{
			User u= UserDao.userlogin(request.getParameter("email"), request.getParameter("password"));
			if(u==null) {
				request.setAttribute("msg", "Incorrect Email/Password");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else {
				if(u.getUsertype().equals("user")) 
				{
					HttpSession session=request.getSession();
					session.setAttribute("u",u);
					request.getRequestDispatcher("index.jsp").forward(request, response);	
				}
				else
				{
					HttpSession session=request.getSession();
					session.setAttribute("u",u);
					request.getRequestDispatcher("seller_index.jsp").forward(request, response);	
				}
				
			}
		}
		else if(action.equalsIgnoreCase("changepassword")) {
			HttpSession session=request.getSession();
			User u=(User)session.getAttribute("u");
			if(u.getUsertype().equals("user")) 
			{
				if(u.getPassword().equals(request.getAttribute("oldpassword"))) 
				{
					if(request.getParameter("newpassword").equals(request.getParameter("cnewpassword")))
					{
						UserDao.changepassword(u.getEmail(), request.getParameter("newpassword"));
						response.sendRedirect("logout.jsp");
					}else {
						request.setAttribute("msg", "Password and New Password does not match");
						request.getRequestDispatcher("changepassword.jsp").forward(request, response);
					}
				}else 
				{
					request.setAttribute("msg", "Old password does not match");
					request.getRequestDispatcher("changepassword.jsp").forward(request, response);
				}
			}
			else
			{
				if(u.getPassword().equals(request.getAttribute("oldpassword"))) 
				{
					if(request.getParameter("newpassword").equals(request.getParameter("cnewpassword")))
					{
						UserDao.changepassword(u.getEmail(), request.getParameter("newpassword"));
						response.sendRedirect("logout.jsp");
					}else {
						request.setAttribute("msg", "Password and New Password does not match");
						request.getRequestDispatcher("seller_changepassword.jsp").forward(request, response);
					}
				}else 
				{
					request.setAttribute("msg", "Old password does not match");
					request.getRequestDispatcher("seller_changepassword.jsp").forward(request, response);
				}
			}
			
		}
		else if(action.equalsIgnoreCase("update")) {
			User u=new User();
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			u.setAddress(request.getParameter("address"));
			u.setUsertype(request.getParameter("usertype"));
			UserDao.profile(u);
			HttpSession session=request.getSession();
			session.setAttribute("u", u);
			if(u.getUsertype().equals("user")) 
			{
			request.getRequestDispatcher("profile.jsp").forward(request, response);;
			}
			else 
			{
				request.getRequestDispatcher("seller_profile.jsp").forward(request, response);;	
			}
		}
		else if(action.equalsIgnoreCase("send OTP")) 
		{
			String email= request.getParameter("email");
			boolean flag=UserDao.checkEmail(email);
			if(flag==true) 
			{
				int min=1000;
				int max=9999;
				int otp=(int)Math.floor(Math.random()*(max-min+1)+min);
				Services.sendMail(email, otp);
				request.setAttribute("email", email);
				request.setAttribute("otp", otp);
				request.setAttribute("msg", "OTP send Successfully");
				request.getRequestDispatcher("otp.jsp").forward(request, response);
				
			}
			else 
			{
			request.setAttribute("msg", "Email_Id not Registered");	
			request.getRequestDispatcher("forgotpassword.jsp").forward(request, response);;
			}
		}
		else if(action.equalsIgnoreCase("verify OTP"))
		{
		String email=	request.getParameter("email");
		int otp1=Integer.parseInt(request.getParameter("otp1"));
		int otp2=Integer.parseInt(request.getParameter("otp2"));
		if(otp1==otp2)
		{
			request.setAttribute("email", email);
			request.getRequestDispatcher("newpassword.jsp").forward(request, response);
			
			
		}else {
			request.setAttribute("email", email);
			request.setAttribute("otp", otp1);
			request.setAttribute("msg", "Invalid OTP");
			request.getRequestDispatcher("otp.jsp").forward(request, response);
		}
		
		}
		else if(action.equalsIgnoreCase("update password")){
			String email=request.getParameter("email");
			String np=request.getParameter("newpassword");
			String cnp=request.getParameter("cnewpassword");
			if(np.equals(cnp)) 
			{
				UserDao.changepassword(email, np);
				response.sendRedirect("login.jsp");
			}
			else {
				request.setAttribute("email", email);
				request.setAttribute("msg", "New password and confirm password does not match");
				request.getRequestDispatcher("newpassword.jsp").forward(request, response);
				
			}
			
		}
	}
	

}
