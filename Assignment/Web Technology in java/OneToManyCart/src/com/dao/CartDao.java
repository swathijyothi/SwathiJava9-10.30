package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Cart;
import com.bean.Item;
import com.util.CartUtil;

public class CartDao {
	public static void insertCart(Cart c) {
		Session session=CartUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(c);
		tr.commit();
		session.close();
	}
	public static void insertItem(Item it) {
		Session session=CartUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(it);
		tr.commit();
		session.close();
	}
	public static Cart getCartById(int id) {
		
			Session session=CartUtil.createSession();
			Cart c=session.get(Cart.class, id);
			session.close();
			return c;
		}
	public static List<Cart>getAllCart(){
		Session session=CartUtil.createSession();
		List<Cart>list=session.createQuery("from Cart").list();
		session.close();
		return list;
		
	}public static Item getItemById(int cid) {
		
		Session session=CartUtil.createSession();
		Item it= session.get(Item.class, cid);
		session.close();
		return it;
	}
public static List<Item>getItemListById(int cid) {
		
		Session session=CartUtil.createSession();
		List<Item>list= session.createQuery("from Item t where t.cart=c.cartId").list();
		session.close();
		return list;
	
	}
}
