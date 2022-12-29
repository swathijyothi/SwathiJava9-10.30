package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmpUtil {

	public static Connection CreateConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restful", "root", "");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
}
