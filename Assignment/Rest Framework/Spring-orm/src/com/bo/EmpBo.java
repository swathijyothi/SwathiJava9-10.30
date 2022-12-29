package com.bo;

import java.util.List;

import com.bean.Employee;
import com.dao.EmpDao;

public class EmpBo {
	
	private EmpDao empDao;

	public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	public void insertEmp(Employee e) {
		this.empDao.insertEmp(e);
	}
 public List<Employee>getAllEmployee()
 {
  return this.empDao.getAllEmployee();
 }
 public Employee getEmpById(int id)
 {
	 return this.empDao.getEmpById(id);
 }
 public void deleteEmployee(int id)
 {
	 this.empDao.deleteEmployee(id);
 }
}
