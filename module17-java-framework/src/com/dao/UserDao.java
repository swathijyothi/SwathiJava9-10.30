package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.User;

public class UserDao extends HibernateDaoSupport {
	
	public void inserUser(User u) {
		
		getHibernateTemplate().saveOrUpdate(u);
	}

}
