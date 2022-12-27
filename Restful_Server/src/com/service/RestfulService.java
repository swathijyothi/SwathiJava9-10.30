package com.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.bean.Employee;
import com.google.gson.Gson;
import com.model.DB_Operation;
import com.model.DB_OperationInterface;

@Path("employee")
public class RestfulService implements RestfulService_Inferface{
 Gson gson=new Gson();
 DB_OperationInterface dao= new DB_Operation();
	
	
 @Path("add")
 @Produces(MediaType.TEXT_PLAIN)
 @Consumes(MediaType.APPLICATION_JSON)
 @POST
	@Override
	public String addEmployee(String employee) {
		Employee e= gson.fromJson(employee, Employee.class);
		int result = dao.insertData(e);
		if(result>0) {
			return "Data Inserted Successfully";
		}else {
			return "Error in inserting data";
		}
	}

 @Path("update")
 @Produces(MediaType.TEXT_PLAIN)
 @Consumes(MediaType.APPLICATION_JSON)
 @POST
	@Override
	public String updateEmployee(String employee) {
		Employee e= gson.fromJson(employee, Employee.class);
		int result= dao.updateData(e);
		if(result>0) {
			return "Data Updated Successfully";
			}
		else {
			return "Error in Updating data";
			
		}
	}

 @Path("viewall")
 @Produces(MediaType.TEXT_PLAIN)
 @GET
	@Override
	public String viewAllEmployee() {
		List<Employee>list =dao.viewData();
		return gson.toJson(list);
	}

 @Path("delete")
 @Produces(MediaType.TEXT_PLAIN)
 
 @GET
	@Override
	public String deleteEmployee(@QueryParam("id") int id) {
		
		int result= dao.deleteData(id);
		if(result>0) {
			return "Data deleted successfully";
		}
		else {
			return "Error in deleting data ";
					
		}
	}

	
}
