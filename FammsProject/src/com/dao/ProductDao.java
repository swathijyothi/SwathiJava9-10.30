package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.util.FammsUtil;

public class ProductDao {

	public static void addProduct(Product p) {
		try {
			Connection conn=FammsUtil.createConnection();
			String sql="insert into Product (uid,product_category,product_name,product_model,product_image,product_price,product_desc) values(?,?,?,?,?,?,?)";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, p.getUid());
		pst.setString(2, p.getProduct_category());
		pst.setString(3, p.getProduct_name());
		pst.setString(4, p.getProduct_model());
		pst.setString(5, p.getProduct_image());
		pst.setInt(6, p.getProduct_price());
		pst.setString(7, p.getProduct_description());
		pst.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Product>getAllProduct()
	{
		List<Product>list=new ArrayList<Product>();
		try {
			Connection conn=FammsUtil.createConnection();
			String sql="select * from product";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_model(rs.getString("product_model"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_price(rs.getInt("product_price"));
				p.setProduct_description(rs.getString("product_desc"));
				list.add(p);
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static Product getProductById(int pid)
	{
		Product p=null;
		try {
			Connection conn=FammsUtil.createConnection();
			String sql="select * from product where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				 p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_model(rs.getString("product_model"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_price(rs.getInt("product_price"));
				p.setProduct_description(rs.getString("product_desc"));
			
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	public static void editProduct(Product p) {
		try {
			Connection conn=FammsUtil.createConnection();
			String sql="update  Product set product_category=?,product_name=?,product_model=?,product_price=?,product_desc=? where pid=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1, p.getProduct_category());
		pst.setString(2, p.getProduct_name());
		pst.setString(3, p.getProduct_model());
		
		pst.setInt(4, p.getProduct_price());
		pst.setString(5, p.getProduct_description());
		pst.setInt(6, p.getPid());
		pst.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteProduct(int pid) {
		try {
			Connection conn=FammsUtil.createConnection();
			String sql="delete from product where pid=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, pid);
		
		pst.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Product>getProductByCategory(String product_category)
	{
		List<Product>list=new ArrayList<Product>();
		try {
			Connection conn=FammsUtil.createConnection();
			String sql="select * from product where product_category=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, product_category);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_model(rs.getString("product_model"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_price(rs.getInt("product_price"));
				p.setProduct_description(rs.getString("product_desc"));
				list.add(p);
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
