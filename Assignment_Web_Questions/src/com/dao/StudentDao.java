package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {
	
	public static void insertStudent(Student s) {
		try {
			Connection conn= StudentUtil.createConnection();
			String sql="insert into student(fname,lname,email,mobile,gender,password)values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getGender());
			pst.setString(6, s.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
 public static List<Student> getAllStudent(){
	 List<Student>list=new ArrayList<Student>();
	 try {
		Connection conn= StudentUtil.createConnection();
		String sql="select * from student";
		PreparedStatement pst=conn.prepareStatement(sql);
		
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			Student s=new Student();
			s.setId(rs.getInt("id"));
			s.setFname(rs.getString("fname"));
			s.setLname(rs.getString("lname"));
			s.setEmail(rs.getString("email"));
			s.setMobile(rs.getLong("mobile"));
			s.setGender(rs.getString("gender"));
			s.setPassword(rs.getString("password"));
			
			list.add(s);
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	 return list;
 }
}
