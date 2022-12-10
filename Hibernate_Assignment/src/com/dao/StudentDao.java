package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {
	public static void insertStudent(Student s) {
		Session session=StudentUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(s);
		tr.commit();
		session.close();
	}

}
