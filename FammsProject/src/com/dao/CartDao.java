package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Cart;
import com.bean.Product;
import com.bean.Wishlist;
import com.util.FammsUtil;

public class CartDao {
	
public static void addToCart(Cart c) {
		
		try 
		{
		Connection conn= FammsUtil.createConnection();
		String sql="insert into cart (pid,uid,product_price,product_qty,total_price) values(?,?,?,?,?)";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, c.getPid());
		pst.setInt(2, c.getUid());
		pst.setInt(3, c.getProduct_price());
		pst.setInt(4, c.getProduct_qty());
		pst.setInt(5, c.getTotal_price());
		pst.executeUpdate();
		
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
public static List<Cart>getCartById(int uid)
{
	String payment_status="pending";
	List<Cart>list=new ArrayList<Cart>();
	try {
		Connection conn=FammsUtil.createConnection();
		String sql="select * from cart where uid=? and payment_status=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, uid);
		pst.setString(2, payment_status);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			Cart c=new Cart();
			c.setCid(rs.getInt("cid"));
			c.setPid(rs.getInt("pid"));
			c.setUid(rs.getInt("uid"));
			c.setProduct_price(rs.getInt("product_price"));
			c.setProduct_qty(rs.getInt("product_qty"));
			c.setTotal_price(rs.getInt("total_price"));
			list.add(c);
			}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
}
public static boolean checkcart(int pid,int uid) {
	boolean flag=false;
	try {
		Connection conn=FammsUtil.createConnection();
		String sql="select * from cart where pid= ? and uid=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, pid);
		pst.setInt(2, uid);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			flag=true;
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return flag;
}
public static void removeCart(Cart c)
{
	try {
		Connection conn=FammsUtil.createConnection();
		String sql="delete from cart where pid= ? and uid=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, c.getPid());
		pst.setInt(2, c.getUid());
		pst.executeUpdate();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public static Cart getCartProductById(int cid)
{
	Cart p=null;
	try {
		Connection conn=FammsUtil.createConnection();
		String sql="select * from cart where cid=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, cid);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			 p=new Cart();
			 p.setCid(rs.getInt("cid"));
			p.setPid(rs.getInt("pid"));
			p.setUid(rs.getInt("uid"));
			p.setProduct_price(rs.getInt("product_price"));
			p.setProduct_qty(rs.getInt("product_qty"));
			p.setTotal_price(rs.getInt("total_price"));
			
		
			}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return p;
}
public static void updateToCart(Cart c) {
	
	try 
	{
	Connection conn= FammsUtil.createConnection();
	String sql="update  cart set product_qty =?,total_price =? where cid=?";
	PreparedStatement pst=conn.prepareStatement(sql);
	
	pst.setInt(1, c.getProduct_qty());
	pst.setInt(2, c.getTotal_price());
	pst.setInt(3, c.getCid());
	pst.executeUpdate();
	
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

public static List<Cart>getPendingCartById(int uid,String payment_status)
{
	
	List<Cart>list=new ArrayList<Cart>();
	try {
		Connection conn=FammsUtil.createConnection();
		String sql="select * from cart where uid=? and payment_status=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, uid);
		pst.setString(2, payment_status);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			Cart c=new Cart();
			c.setCid(rs.getInt("cid"));
			c.setPid(rs.getInt("pid"));
			c.setUid(rs.getInt("uid"));
			c.setProduct_price(rs.getInt("product_price"));
			c.setProduct_qty(rs.getInt("product_qty"));
			c.setTotal_price(rs.getInt("total_price"));
			c.setPayment_status(rs.getString("payment_status"));
			list.add(c);
			}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
}

public static void updateCartStatus(int uid) {
	String payment_status="paid";
	try {
		Connection conn=FammsUtil.createConnection();
		String sql="update cart set payment_status=? where uid=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1, payment_status);
		pst.setInt(2, uid);
		pst.executeUpdate();
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
