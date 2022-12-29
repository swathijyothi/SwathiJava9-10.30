package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection implements DB_ConnectionInterface{

	@Override
	public Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restful", "root", "");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
