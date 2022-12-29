package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

import com.util.EmpUtil;

public class EmpDao {
	public static void insertEmployee(Employee e) {
		try {
			Connection conn=EmpUtil.CreateConnection();
			String sql= "insert into employee(fname,lname,email)values(?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			
		pst.executeUpdate();
			
		}catch(Exception e1) {
			e1.printStackTrace();
		
	}

}
	public static List<Employee> getAllEmployee(){
		List<Employee> list=new ArrayList<Employee>();
		try {
			Connection conn=EmpUtil.CreateConnection();
			String sql="select * from employee";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
				e.setEmail(rs.getString("email"));
				
				list.add(e);
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		return list;
	}
	public static Employee getEmployeeById(int id) {
		Employee e=null;
		try {
			Connection conn=EmpUtil.CreateConnection();
			String sql="select * from employee where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				 e=new Employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
				e.setEmail(rs.getString("email"));
				
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}return e;
	
	}
	public static void deleteEmployee(int id) {
		try {
			Connection conn=EmpUtil.CreateConnection();
			String sql="delete from employee where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void updateEmployee(Employee e) {
		try {
			Connection conn=EmpUtil.CreateConnection();
			String sql="update employee set fname=?,lname=?,email=? where id=?";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			
			pst.setInt(4, e.getId());
			pst.executeUpdate();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}