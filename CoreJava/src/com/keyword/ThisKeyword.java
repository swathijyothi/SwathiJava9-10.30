package com.keyword;
class student{
	int rollno;
	String name;
	student(){
		System.out.println("Default constructor");
	}
	
	student(int rollno,String name)
	{  
		this.rollno=rollno;
	     this.name=name; 
		System.out.println("rollno="+this.rollno);
		System.out.println("name="+this.name);
	}
	
	
	
	
}
public class ThisKeyword {
	public static void main(String[] args) {
		student s1=new student();
		student s2=new student(1,"swa");
		
	}

}
