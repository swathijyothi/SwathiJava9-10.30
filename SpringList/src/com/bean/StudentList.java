package com.bean;


import java.util.List;

public class StudentList {
	private List<Student>list;

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
	
	public void displayList() {
		for(Student s:list) {
			System.out.println(list);
		}
	}
	

}
