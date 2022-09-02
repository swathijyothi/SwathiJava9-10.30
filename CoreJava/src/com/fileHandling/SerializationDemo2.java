package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
	int id;
	String name;
	transient float mark;
	static String schoolname;
	public student(int id, String name, float mark,String schoolname) {
		
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.schoolname=schoolname;
	}
	public String toString(){
		return "\n id="+id+"\n name="+name+"\n mark="+mark+"\n schoolname="+schoolname;
	}
	
}
public class SerializationDemo2 {
	public static void main(String[] args) throws Exception {
		student s=new student(1,"swathi",89,"uem");
		FileOutputStream f1=new FileOutputStream("ser2.txt");
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		o1.writeObject(s);
		o1.flush();
		o1.close();
		FileInputStream f2=new FileInputStream("ser2.txt");
		ObjectInputStream o2=new ObjectInputStream(f2);
		student s1=(student)o2.readObject();
		System.out.println(s1);
		
		
	}

}
