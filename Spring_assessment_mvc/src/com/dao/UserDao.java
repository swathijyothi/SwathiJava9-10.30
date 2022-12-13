package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.User;

public class UserDao extends HibernateDaoSupport {
	
	public void insertUser(User u) {
		getHibernateTemplate().save(u);
	}

}
