package com.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Dept;
import com.bean.Emp;
import com.util.EmpUtil;

public class EmpDao {
	
	public static void insertDept(Dept d) 
	{
		Session session= EmpUtil.CreateSession();
	Transaction tr= session.beginTransaction();
	session.saveOrUpdate(d);
	tr.commit();
	session.close();
		
	}
	public static void insertEmp(Emp e)
	{
		Session session= EmpUtil.CreateSession();
		Transaction tr= session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
				
	}
	public static List<Dept> getAllList()
	{
		Session session= EmpUtil.CreateSession();
	List<Dept>list=	session.createQuery("from Dept").list();
	session.close();
	return list;
	}
public static Dept getDeptById(int id )
{
	Session session =EmpUtil.CreateSession();
	Dept d= session.get(Dept.class, id);
	session.close();
	return d;
}
}
