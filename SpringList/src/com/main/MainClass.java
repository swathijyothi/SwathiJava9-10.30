package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.bean.StudentList;

public class MainClass {

		
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		StudentList list= (StudentList) a.getBean("StudentList");
		list.displayList();
	}

}
