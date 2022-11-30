package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class EmployeeUtil {

	public static Session createsession() {
		SessionFactory sf= new Configuration()
				.addAnnotatedClass(Employee.class)
				.configure()
				.buildSessionFactory();
		Session session =sf.openSession();
		return session;
				
		
	}
}
