package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Address;
import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {
	public static void insertStudent(Student s) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();
		
	}
	public static void insertAddress(Address a) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.save(a);
		tr.commit();
		session.close();
		
	}
	public static void updateStudent(Student s) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.update(s);;
		tr.commit();
		session.close();
		
	}
	public static void updateAddress(Address a) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.update(a);;
		tr.commit();
		session.close();
		
	}
	
	public static List<Address>getAllAddress(){
		Session session=StudentUtil.createSession();
		List<Address>list=	session.createQuery("from Address").list();
	session.close();
	return list;
	
	}
	public static List<Student>getAllStudent(){
		Session session=StudentUtil.createSession();
		List<Student>list=	session.createQuery("from Student").list();
	session.close();
	return list;
	
	}
	public static Student getStudentById(int aid) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		Student s=session.get(Student.class, aid);
		
		session.close();
		return s;
		
	}
	public static Address getAddressById(int aid) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		Address a=session.get(Address.class, aid);
		
		session.close();
		return a;
		
	}
	public static void deleteStudent(int aid) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		Student s=session.get(Student.class, aid);
		Address a=session.get(Address.class, aid);
		session.delete(a);
		session.delete(s);
		tr.commit();
		session.close();
	}
}
