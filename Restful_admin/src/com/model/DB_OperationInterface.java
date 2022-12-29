package com.model;

import java.util.List;

import com.bean.Employee;

public interface DB_OperationInterface {
	public int insertData(Employee employee);
	public int updateData(Employee employee);
	public List<Employee>viewData();
	public int deleteData(int id);

}
