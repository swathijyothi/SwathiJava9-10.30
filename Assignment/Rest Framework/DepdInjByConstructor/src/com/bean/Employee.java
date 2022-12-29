package com.bean;

public class Employee {
	int id;
	String fname,lname,email;
	public Employee(int id, String fname, String lname, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public  String toString() {
		return "\n ID:"+id+"\n Fname:"+fname+"\nLname:"+lname+"\nEmail:"+email;
		
	}
	

}
