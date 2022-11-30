package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.util.EmployeeUtil;

public class EmpDao {
	public static void insertEmp(Employee e) {
		Session session =EmployeeUtil.createsession();
		Transaction tr= session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
public static List<Employee>getAllEmployee(){
	Session session=EmployeeUtil.createsession();
	List<Employee>list=session.createQuery("from Employee").list();
 session.close();
 return list;
}
public static Employee getByEmployeeId(int id) {
	Session session=EmployeeUtil.createsession();
	Employee e=session.get(Employee.class,id);
	session.close();
	return e;
}
public static void deleteEmpById(int id) {
	Session session=EmployeeUtil.createsession();
	Transaction tr= session.beginTransaction();
	Employee e=session.get(Employee.class, id);
	session.delete(e);
	tr.commit();
	session.close();
}
}
