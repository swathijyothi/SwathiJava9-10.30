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
	DB_Connection db= new DB_Connection();
	
	@Override
	public int insertData(Employee employee) {
		int result =0;
		
		conn=db.getConnection();
		String sql="insert into user(firstname,lastname,email,mobile,gender,image) values(?,?,?,?,?,?)";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, employee.getFirstname());
			pst.setString(2, employee.getLastname());
			pst.setString(3, employee.getEmail());
			pst.setLong(4, employee.getMobile());
			pst.setString(5, employee.getGender());
			pst.setString(6, employee.getImage());
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateData(Employee employee) {
		
int result =0;
		
		conn=db.getConnection();
		String sql="update user set firstname=?,lastname=?,email=?,mobile=?,gender=?,image=?password=? where id=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, employee.getFirstname());
			pst.setString(2, employee.getLastname());
			pst.setString(3, employee.getEmail());
			pst.setLong(4, employee.getMobile());
			pst.setString(5, employee.getGender());
			pst.setString(6, employee.getImage());
			pst.setString(7, employee.getPassword());
			pst.setInt(8, employee.getId());
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Employee> viewData() {
		
		List<Employee>list=new ArrayList<Employee>();
		conn=db.getConnection();
		String sql="select * from user";
		try {
			pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
			e.setFirstname(rs.getString("firstname"));
			e.setLastname(rs.getString("lastname"));
			e.setEmail(rs.getString("email"));
			e.setMobile(rs.getLong("mobile"));
			e.setGender(rs.getString("gender"));
			e.setImage(rs.getString("image"));
			e.setPassword(rs.getString("password"));
			list.add(e);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteData(int id) {
		int result=0;
		conn=db.getConnection();
		String sql="delete from user where id=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setInt(1,id);
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
