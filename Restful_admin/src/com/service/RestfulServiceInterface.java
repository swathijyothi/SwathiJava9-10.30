package com.service;

public interface RestfulServiceInterface {
	
	String addEmployee(String employee);
	String updateEmployee(String employee);
	String viewAllEmployee();
	String deleteEmployee(int id);

}
