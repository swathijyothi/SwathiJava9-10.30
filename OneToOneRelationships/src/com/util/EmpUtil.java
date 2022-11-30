package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Emp;
import com.bean.EmpInfo;

public class EmpUtil {
	public static Session createSession() {
		SessionFactory SF=new Configuration()
				.addAnnotatedClass(EmpInfo.class)
				.addAnnotatedClass(Emp.class)
				.configure()
				.buildSessionFactory();
		Session session=SF.openSession();
		return session;
	}

}
