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
			Connection conn=StudentUtil.createConnection();
			String sql="insert into student(fname,lname,email,mobile,address,gender,password,cpassword)values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getAddress());
			pst.setString(6, s.getGender());
			pst.setString(7, s.getPassword());
			pst.setString(8, s.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static List<Student>getAllStudent(){
		List<Student>list=new ArrayList<Student>();
		try {
			Connection conn=StudentUtil.createConnection();
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
				s.setAddress(rs.getString("address"));
				s.setGender(rs.getString("gender"));
				s.setPassword(rs.getString("password"));
				s.setCpassword(rs.getString("cpassword"));
				list.add(s);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
public static boolean CheckEmail(String email) {
	boolean flag=false;
	try {
		Connection conn=StudentUtil.createConnection();
		String sql="select * from student where email=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1, email);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			flag=true;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}return flag;
}
public static Student studentLogin(String email,String password) {
	Student s=null;
	try {
		Connection conn=StudentUtil.createConnection();
		String sql="select * from student where email=? and password=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1, email);
		pst.setString(2, password);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			s=new Student();
			s.setId(rs.getInt("id"));
			s.setFname(rs.getString("fname"));
			s.setLname(rs.getString("lname"));
			s.setEmail(rs.getString("email"));
			s.setMobile(rs.getLong("mobile"));
			s.setAddress(rs.getString("address"));
			s.setGender(rs.getString("gender"));
			s.setPassword(rs.getString("password"));
			s.setCpassword(rs.getString("cpassword"));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}return s;
}
public static Student getStudentById(int id) {
	Student s=null;
	try {
		Connection conn=StudentUtil.createConnection();
		String sql="select * from student where id=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			s=new Student();
			s.setId(rs.getInt("id"));
			s.setFname(rs.getString("fname"));
			s.setLname(rs.getString("lname"));
			s.setEmail(rs.getString("email"));
			s.setMobile(rs.getLong("mobile"));
			s.setAddress(rs.getString("address"));
			s.setGender(rs.getString("gender"));
			s.setPassword(rs.getString("password"));
			s.setCpassword(rs.getString("cpassword"));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}return s;
}
public static void updateStudent(Student s) {
	try {
		Connection conn=StudentUtil.createConnection();
		String sql="update student set fname=?,lname=?,mobile=?,address=?,gender=?,password=?,cpassword=? where email=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1, s.getFname());
		pst.setString(2, s.getLname());
	    pst.setLong(3, s.getMobile());
		pst.setString(4, s.getAddress());
		pst.setString(5, s.getGender());
		pst.setString(6, s.getPassword());
		pst.setString(7, s.getPassword());
		pst.setString(8, s.getEmail());
		pst.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void ChangePassword(String email,String password) {
	try {
		Connection conn=StudentUtil.createConnection();
		String sql="update student set password=? where email=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1, password);
	    pst.setString(2, email);
		pst.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
