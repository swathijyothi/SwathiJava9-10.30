package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;
import com.mysql.jdbc.jdbc2.optional.PreparedStatementWrapper;
import com.util.StudentUtil;

public class StudentDao {
	public static void insertStudent(Student s) {
		try {
			Connection conn=StudentUtil.CreateConnection();
			String sql="insert into student_crud(fname,lname,email,mobile,gender,password)values(?,?,?,?,?,?)";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getGender());
			pst.setString(6, s.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Student>getAllStudent(){
		List<Student>list=new ArrayList<Student>();
		try {
			Connection conn=StudentUtil.CreateConnection();
			String sql="select * from student_crud";
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
			e.printStackTrace();
		}
		return list;
	}
	public static Student getStudentById(int id) {
		Student s=null;
		try {
			Connection conn=StudentUtil.CreateConnection();
			String sql="select * from Student_crud where id=?";
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
				s.setGender(rs.getString("gender"));
				s.setPassword(rs.getString("password"));	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}return s;
	}
	public static void updateStudent(Student s) {
		try {Connection conn=StudentUtil.CreateConnection();
		String sql="update student_crud set fname=?,lname=?,email =?,mobile=?,gender =?,password =? where id=?";
		PreparedStatement pst= conn.prepareStatement(sql);
		pst.setString(1, s.getFname());
		pst.setString(2, s.getLname());
		pst.setString(3, s.getEmail());
		pst.setLong(4, s.getMobile());
		pst.setString(5, s.getGender());
		pst.setString(6, s.getPassword());
		pst.setInt(7, s.getId());
		pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Student deleteStudent(int id) {
		Student s=null;
		try {
			Connection conn=StudentUtil.CreateConnection();
			String sql="delete  from student_crud where id=?";
	PreparedStatement pst=conn.prepareStatement(sql);
	s=new Student();
	pst.setString(1, s.getFname());
	pst.setString(2, s.getLname());
	pst.setString(3, s.getEmail());
	pst.setLong(4, s.getMobile());
	pst.setString(5, s.getGender());
	pst.setString(6, s.getPassword());
  pst.setInt(7, id);
	pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

}
