package com.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ValidationFormFilter
 */
@WebFilter("/ValidFilter")
public class ValidationFormFilter implements Filter {

  
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String fn =request.getParameter("fname");
		String ln=request.getParameter("lname");
		String e=request.getParameter("email");
		String m=request.getParameter("mobile");
		String p=request.getParameter("password");
		
		if(fn.equals("")) {
			String msg="first name cannot be empty";
			request.setAttribute("msg", msg);
		}
		
		else {
		chain.doFilter(request, response);
	}
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
