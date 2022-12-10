package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		Employee e= (Employee) a.getBean("e1");
		
		e.setId(1);
		e.setFname("swathi");
		e.setLname("udayan");
		e.setEmail("swathi@gmail.com");
		
		System.out.println("\n ID:"+e.getId());
		System.out.println("\n FNAME:"+e.getFname());
		System.out.println("\n LNAME:"+e.getLname());
		System.out.println("\n EMAIL:"+e.getEmail());
		
		Employee e2= (Employee) a.getBean("e1");
		
		
		
		System.out.println("\n ID:"+e2.getId());
		System.out.println("\n FNAME:"+e2.getFname());
		System.out.println("\n LNAME:"+e2.getLname());
		System.out.println("\n EMAIL:"+e2.getEmail());
	}

}
