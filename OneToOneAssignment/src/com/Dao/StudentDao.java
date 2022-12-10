package com.Dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Address;
import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {
	public static void insertStudent(Student s) {
		Session session = StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(s);
		tr.commit();
		session.close();
		
	}
	public static void insertAddress(Address a) {
		Session session = StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(a);
		tr.commit();
		session.close();
		
	}
}
