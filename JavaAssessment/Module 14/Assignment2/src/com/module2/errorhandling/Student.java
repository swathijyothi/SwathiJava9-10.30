package com.module2.errorhandling;

import java.util.Scanner;

public class Student {
	int rollno;
	String name;
	int age ;
	String course;
	
	
	
public Student(int rollno, String name, int age, String course) {
		
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}

void checkAge(int age) throws AgeNotWithinRange{
	if(age>=15&&age<=21) {
System.out.println("Eligible");

	}else {
		
		throw new AgeNotWithinRange(age);
	}
}
void checkName(String n) throws NameNotValid {
	int i;
	int l=n.length();
	char c[]=n.toCharArray();
	for(i=0;i<l;i++) {
		if((c[i]>='a'&&c[i]<='z')||(c[i]>='A'&&c[i]<='Z')){
			System.out.println("name is valid");
		
		}else {
		
			throw new NameNotValid(n);
		}
	}
	}
public  void print() {
	
	System.out.println("Roll no:"+this.rollno);
	System.out.println("Name:"+this.name);
	System.out.println("Age:"+this.age);
	System.out.println("course:"+this.course);
	
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int r,age;
	String name,course;
	System.out.println("Enter the Roll No:");
	r=sc.nextInt();
	System.out.println("Enter the Name:");
	name=sc.next();
	System.out.println("Enter the Age:");
	age=sc.nextInt();
	System.out.println("Enter the course");
	course=sc.next();
	Student s=new Student(r,name,age,course);
	try {
		s.checkAge(age);
	} catch (AgeNotWithinRange e) {
	System.out.println(age +" "+"Age not within range 15-21");
	}
	try {
		s.checkName(name);
	} catch (NameNotValid e) {
		
		System.out.println("Name  is not Valid");
	}
	s.print();
}
}
