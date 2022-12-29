package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import com.bean.Employee;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String WebServiceURI="http://localhost:8081/Restful_Server/";
	ClientConfig clientConfig = null;
	Client client = null;
	WebTarget webTarget = null;
	Gson gson = null;
	
	public MainServlet() {
		super();
	} 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		clientConfig =new ClientConfig();
		client=ClientBuilder.newClient(clientConfig);
		webTarget = client.target(WebServiceURI).path("rest");
		gson = new Gson();
		
		String action= request.getParameter("action");
		if(action.equalsIgnoreCase("insert")) {
			
			Employee e=new Employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			String s = gson.toJson(e);
			Response res = webTarget.path("employee").path("add").request().post(Entity.json(s));
			String result = res.readEntity(String.class);
			System.out.println(result);
			
			RequestDispatcher view = null;
			
			if(res.getStatus()==200)
			{
				showEmployee(request,response);
			}
			else
			{
				request.setAttribute("msg", result);
				view = request.getRequestDispatcher("errorpage.jsp");
				view.forward(request, response);
			}
			System.out.println(result);
		}
		if(action.equalsIgnoreCase("update")) {
			Employee e=new Employee();
			e.setId(Integer.parseInt(request.getParameter("id")));
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));

			String s = gson.toJson(e);
			Response res = webTarget.path("employee").path("update").request().post(Entity.json(s));
			String result = res.readEntity(String.class);
			
			System.out.println(result);
			
			RequestDispatcher view = null;
			
			if(res.getStatus()==200)
			{
				
				showEmployee(request,response);
			}
			else
			{
				request.setAttribute("msg", result);
				view = request.getRequestDispatcher("errorpage.jsp");
				view.forward(request, response);
			}
			System.out.println(result);
		}
		if(action.equalsIgnoreCase("delete")) {
			RequestDispatcher rd = null;
			String id = request.getParameter("id");
			
			Response res = webTarget.path("employee").path("delete").queryParam("id", id).request().get();
			String result = res.readEntity(String.class);
			
			if(res.getStatus()==200)
			{
				showEmployee(request,response);
			}
			else
			{
				request.setAttribute("msg", result);
				rd = request.getRequestDispatcher("errorpage.jsp");
				rd.forward(request, response);
			}
			System.out.println(result);
		}
	}

protected void showEmployee(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		Response res = webTarget.path("employee").path("viewall").request().get();
		String result = res.readEntity(String.class);
		
		if(res.getStatus()==200)
		{
			List<Employee> emplist=gson.fromJson(result,new TypeToken<List<Employee>>(){}.getType());
			request.setAttribute("employees", emplist);
		}
		else
		{
			request.setAttribute("error", "Error in Fetching All Employees");			
		}
		System.out.println(result);
		RequestDispatcher view = request.getRequestDispatcher("profilepage.jsp");
		view.forward(request, response);
		
		
		
	}


	
}
