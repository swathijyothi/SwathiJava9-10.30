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

import com.service.Services;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("action");
		if(action.equalsIgnoreCase("signup")) {
			
			boolean flag=StudentDao.CheckEmail(request.getParameter("email"));
			if(flag==true) {
				request.setAttribute("msg", "Email Already Exits");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
				
			}else if(request.getParameter("password").equals(request.getParameter("cpassword"))){
				Student s=new Student();
				s.setFname(request.getParameter("fname"));
				s.setLname(request.getParameter("lname"));
				s.setEmail(request.getParameter("email"));
				s.setMobile(Long.parseLong(request.getParameter("mobile")));
				s.setAddress(request.getParameter("address"));
				s.setGender(request.getParameter("gender"));
				s.setPassword(request.getParameter("password"));
				s.setCpassword(request.getParameter("cpassword"));
				StudentDao.insertStudent(s);
				
			
			String email=request.getParameter("email");
			System.out.println(email);
			if(email!=null) {
				int min=1000;
				int max=9999;
				int otp=(int)Math.floor(Math.random()*(max-min+1)+min);
				Services.sendMail(email, otp);
				request.setAttribute("email", email);
				request.setAttribute("otp", otp);
				request.setAttribute("msg", "OTP send Successfully");
				request.getRequestDispatcher("loginotp.jsp").forward(request, response);
				 
			    
			}else {
				request.setAttribute("msg", "Invalid Email....!");
				request.getRequestDispatcher("loginotp.jsp").forward(request, response);
			   }
			}
			else {
				request.setAttribute("msg", "Password and confirm password should be same");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
		}
		
		
			
		  if(action.equalsIgnoreCase("login")) {
			Student s=StudentDao.studentLogin(request.getParameter("email"), request.getParameter("password"));
			if(s==null) {
				request.setAttribute("msg", "Incorrect email/password");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				HttpSession session=request.getSession();
				session.setAttribute("s",s);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
		if(action.equalsIgnoreCase("update")) {
			Student s=new Student();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			s.setAddress(request.getParameter("address"));
			s.setGender(request.getParameter("gender"));
			s.setPassword(request.getParameter("password"));
			s.setCpassword(request.getParameter("cpassword"));
			StudentDao.updateStudent(s);
			response.sendRedirect("student.jsp");
		}
		 if(action.equalsIgnoreCase("changepassword")) {
			HttpSession session=request.getSession();
			Student s=(Student)session.getAttribute("s");
			String email=request.getParameter("email");
			String op=request.getParameter("oldpassword");
			String np=request.getParameter("newpassword");
			String cnp=request.getParameter("cnewpassword");
			
				if(s.getPassword().equals(op))
				{
					if(request.getParameter("newpassword").equals(request.getParameter("cnewpassword")))
					{
						StudentDao.ChangePassword(s.getEmail(), request.getParameter("newpassword"));
						response.sendRedirect("logout.jsp");
					}else {
						request.setAttribute("msg", "confirm Password and New Password does not match");
						request.getRequestDispatcher("changepassword.jsp").forward(request, response);
					}
				}
				else 
				{
					request.setAttribute("msg", "Old password does not match");
					request.getRequestDispatcher("changepassword.jsp").forward(request, response);
				}
			}
			
		if(action.equalsIgnoreCase("send otp")) {
			String email=request.getParameter("email");
			boolean flag=StudentDao.CheckEmail(email);
			if(flag==true) {
				int min=1000;
				int max=9999;
				int otp=(int)Math.floor(Math.random()*(max-min+1)+min);
				Services.sendMail(email, otp);
				request.setAttribute("email", email);
				request.setAttribute("otp", otp);
				request.setAttribute("msg", "OTP send Successfully");
				request.getRequestDispatcher("otp.jsp").forward(request, response);	
			}else {
				
				request.setAttribute("msg", "Email_Id not Registered");	
				request.getRequestDispatcher("forgotpassword.jsp").forward(request, response);
			}
		}
		 if(action.equalsIgnoreCase("verify OTP"))
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
		  if(action.equalsIgnoreCase("update password")){
				String email=request.getParameter("email");
				String np=request.getParameter("newpassword");
				String cnp=request.getParameter("cnewpassword");
				if(np.equals(cnp)) 
				{
					StudentDao.ChangePassword(email, np);
					response.sendRedirect("login.jsp");
				}
				else {
					request.setAttribute("email", email);
					request.setAttribute("msg", "New password and confirm password does not match");
					request.getRequestDispatcher("newpassword.jsp").forward(request, response);
					
				}
				
			
		  
		  }
		  if(action.equalsIgnoreCase("verify"))
			{
			String email=	request.getParameter("email");
			int otp1=Integer.parseInt(request.getParameter("otp1"));
			int otp2=Integer.parseInt(request.getParameter("otp2"));
			if(otp1==otp2)
				
			{   
				
				request.setAttribute("msg", "signup successfully");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
				
				
			}else {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg", "Invalid OTP");
				request.getRequestDispatcher("otp.jsp").forward(request, response);
			}
	}

	
		 
}


}
