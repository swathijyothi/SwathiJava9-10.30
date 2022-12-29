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
	public User UserByEmail(String email,String password) {
		return this.userDao.login(email, password);
	}
	public User getUserById(int id) {
		return this.getUserById(id);
	}
	public  void ChangePassword(String email,String password) {
	this.ChangePassword(email, password);
	}
}
