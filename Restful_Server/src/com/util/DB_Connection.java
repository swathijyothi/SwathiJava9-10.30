package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection implements DB_ConnectionInterface{

	@Override
	public Connection getConnection() {
		Connection conn=null;
		String host,db,uname,url,pass;
		host="jdbc:mysql://localhost:3306/";
		db="restful";
		url=host+db;
		uname="root";
		pass="";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, uname, pass);
		} catch (Exception e) {
		e.printStackTrace();
		}
		return conn;
	}

}
