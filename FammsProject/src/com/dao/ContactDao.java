package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Contact;
import com.util.FammsUtil;

public class ContactDao {
	public static void insertContact(Contact c) {
		try {
			Connection conn = FammsUtil.createConnection();
			String sql="insert into contact (fname,email,subject,message) values(?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, c.getFname());
			pst.setString(2, c.getEmail());
			pst.setString(3, c.getSubject());
			pst.setString(4, c.getMessage());
			pst.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
