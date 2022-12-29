package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Student;
import com.oracle.jrockit.jfr.Transition;
import com.util.StudentUtil;

public class StudentDao {
	public static void insertStudent(Student s) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(s);
		tr.commit();
		session.close();
	}
	public static boolean checkMail(String email) {
		boolean flag=false;
		Session session=StudentUtil.createSession();
	Student s=	session.get(Student.class, email);
	if(s!=null) {
		flag=true;
	}else {
		flag=false;
	}
		return flag;
		
	}
	public static Student StudentLogin(String email,String password) {
		Student s=null;
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
	 s=	(Student) session.get(email, password);
	 return s;
	}
	public static Student getStudentById(int id) {
		Session session=StudentUtil.createSession();
		Student s=session.get(Student.class, id);
		session.close();
		return s;
		
	}

}
