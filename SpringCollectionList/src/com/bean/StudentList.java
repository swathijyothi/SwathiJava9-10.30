package com.bean;


import java.util.Iterator;
import java.util.List;

public class StudentList {
	private List<Student>student;

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	public void displayStudent() {
		 Iterator<Student> itr=student.iterator();  
		    while(itr.hasNext()){  
		        System.out.println(itr.next());  
		    }  
		}  
	}
	


