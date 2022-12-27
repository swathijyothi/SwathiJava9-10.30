package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.User;

import com.util.UserUtil;

public class UserDao extends HibernateDaoSupport {
	
	public void inserUser(User u) {
		
		getHibernateTemplate().saveOrUpdate(u);
	}

		public User login(String email ,String password) {
			User u=null;
			try {
				Connection conn= UserUtil.createConnection();
				String sql="select * from user where email=? and password=?";
				PreparedStatement pst= conn.prepareStatement(sql);
				pst.setString(1, email);
				pst.setString(2, password);
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					u=new User();
					u.setId(rs.getInt("id"));
					u.setFname(rs.getString("fname"));
					u.setLname(rs.getString("lname"));
					u.setEmail(rs.getString("email"));
					u.setPassword(rs.getString("password"));
					u.setCpassword(rs.getString("cpassword"));
				}
				
			} catch (Exception e) {
			e.printStackTrace();
			}return u;
		}
		
		public  void ChangePassword(String email,String password) {
			try {
				Connection conn=UserUtil.createConnection();
				String sql="update user set password=? where email=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setString(1, password);
			    pst.setString(2, email);
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
 

