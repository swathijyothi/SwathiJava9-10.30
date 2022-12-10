package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Employee;

public class EmpDao extends HibernateDaoSupport{
	
	public void insertEmp(Employee e) {
		getHibernateTemplate().saveOrUpdate(e);
	}
public List<Employee> getAllEmployee(){
	
	return getHibernateTemplate().find("from Employee");
}
public Employee getEmpById(int id) {
     HibernateTemplate template= getHibernateTemplate();
      Employee e= template.get(Employee.class, id);
return e;
	
}
public void deleteEmployee(int id)
{
	HibernateTemplate template=getHibernateTemplate();
	Employee e1= template.get(Employee.class, id);
	template.delete(e1);
}
}
