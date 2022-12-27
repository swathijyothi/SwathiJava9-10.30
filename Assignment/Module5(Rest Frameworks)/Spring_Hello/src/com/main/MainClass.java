package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext a= new ClassPathXmlApplicationContext("Beans.xml");
		Employee e=(Employee) a.getBean("s2");
		
		System.out.println("ID:"+e.getId());
		System.out.println(" FIRST NAME:"+e.getFname());
		System.out.println("LAST NAME :"+e.getLname());
		System.out.println("EMAIL:"+e.getEmail());
		System.out.println("MOBILE:"+e.getMobile());
	}

}
