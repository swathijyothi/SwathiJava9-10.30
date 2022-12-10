package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Address;
import com.bean.Student;

public class StudentUtil {
	public static Session createSession() {
	SessionFactory sf	=new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Address.class)
				.buildSessionFactory();
		Session session=sf.openSession();
		return session;
	}

}
