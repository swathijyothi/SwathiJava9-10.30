package com.bo;

import com.bean.User;
import com.dao.UserDao;

public class UserBo {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void inserUser(User u) {
		this.userDao.inserUser(u);
	}
}
