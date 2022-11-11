package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.empBean.Employee;
import com.util.empUtil;



public class EmployeeDao {
	
	public static void insertEmployee(Employee e)
	{
		try {
			Connection conn = empUtil.checkConnection();
			String sql = "insert into emp_crud (fname,lname,email,mobile,address,gender) values (?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			pst.setLong(4, e.getMobile());
			pst.setString(5, e.getAddress());
			pst.setString(6, e.getGender());
			pst.executeUpdate();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public static List<Employee> getAllEmployee()
	{
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			Connection conn =empUtil.checkConnection();
			String sql = "select * from emp_crud";
			PreparedStatement pst = conn.prepareStatement(sql);			
			ResultSet rs = pst.executeQuery();			
			while(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getLong("mobile"));
				e.setAddress(rs.getString("address"));
				e.setGender(rs.getString("gender"));
				list.add(e);
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static Employee getEmployeeById(int id)
	{
		Employee e =null;
		
		try {
			Connection conn = empUtil.checkConnection();
			String sql = "select * from emp_crud where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				e = new Employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getLong("mobile"));
				e.setAddress(rs.getString("address"));
				e.setGender(rs.getString("gender"));
			}
			
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		return e;
	}
	
	public static void updateEmployee(Employee e)
	{
		try {
			Connection conn = empUtil.checkConnection();
			String sql = "update emp_crud set fname=?,lname=?,email=?,mobile=?,address=?,gender=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			pst.setLong(4, e.getMobile());
			pst.setString(5, e.getAddress());
			pst.setString(6, e.getGender());
			pst.setInt(7, e.getId());
			pst.executeUpdate();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}
	
	public static void deleteEmployee(int id)
	{
		try {
			Connection conn = empUtil.checkConnection();
			String sql = "delete from emp_crud where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}












