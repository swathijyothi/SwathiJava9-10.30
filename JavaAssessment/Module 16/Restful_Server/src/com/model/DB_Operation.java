package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;
import com.util.DB_Connection;

public class DB_Operation implements DB_OperationInterface{

	Connection conn=null;
	PreparedStatement pst=null;
	DB_Connection db=new DB_Connection();
	
	@Override
	public int insertData(Employee employee) {
		
		int result=0;
		conn= db.getConnection();
		String sql="insert into employee (fname,lname,email) values(?,?,?)";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, employee.getFname());
			pst.setString(2, employee.getLname());
			pst.setString(3, employee.getEmail());
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateData(Employee employee) {

		
		int result=0;
		conn= db.getConnection();
		String sql="update  employee set fname=?,lname=?,email=? where id=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, employee.getFname());
			pst.setString(2, employee.getLname());
			pst.setString(3, employee.getEmail());
			pst.setInt(4, employee.getId());
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	

	@Override
	public List<Employee> viewData() {
	
		List<Employee> list=new ArrayList<Employee>();
		conn=db.getConnection();
		String sql="select * from employee";
		try {
			pst= conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Employee employee=new Employee();
				employee.setFname(rs.getString("fname"));
				employee.setLname(rs.getString("lname"));
				employee.setEmail(rs.getString("email"));
				employee.setId(rs.getInt("id"));
				list.add(employee);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	@Override
	public int deleteData(int id) {
	
		int result=0;
		conn= db.getConnection();
		String sql="delete from employee where id=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
