package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Employee;

public class EmpDao extends HibernateDaoSupport{
	
	public void insert(Employee e) {
		getHibernateTemplate().saveOrUpdate(e);;
	}

}
