package com.coreJava;

import java.util.Scanner;

public class Student {
	int rollno;
	String firstName;
	String lastName;
	String email;
	long  mobile;
	void getData() {
		System.out.println("enter the data");
		Scanner sc=new Scanner(System.in);
		System.out.println("ROLLNO:");
		rollno = sc.nextInt();
		System.out.println("FIRSTNAME:");
		firstName =sc.next();
		System.out.println("LASTNAME:");
		lastName=sc.next();
		System.out.println("EMAIL:");
		email=sc.next();
		System.out.println("MOBILE NO:");
		mobile=sc.nextLong();
	}
	void display() {
		System.out.println("ROLLNO:"+rollno);
		System.out.println("FIRSTNAME:"+firstName);
		System.out.println("LASTNAME:"+lastName);
		System.out.println("EMAIL:"+email);
		System.out.println("MOBILE NO:"+mobile);
		
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.getData();
		s.display();
		
	}

}
