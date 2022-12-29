package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.bean.StudentList;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		Student s=(Student) a.getBean("s1");
		StudentList l=(StudentList) a.getBean("l1");
		l.displayStudent();
	System.out.println(s);
	
	}

}
