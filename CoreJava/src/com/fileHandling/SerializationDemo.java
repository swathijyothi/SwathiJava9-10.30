package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Employee implements Serializable{
	int eid;
	String ename;
	double esalary;
	public Employee(int eid, String ename, double esalary) {
		
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public String toString() {
		return "eid="+eid+"\n ename="+ename+"\nesalary="+esalary;
		
	}
	
}
public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		Employee e=new Employee(1,"swathi",30000);
		FileOutputStream fos=new FileOutputStream("ser.txt");
		ObjectOutputStream o1=new ObjectOutputStream(fos);
		o1.writeObject(e);
		o1.flush();
		o1.close();
		FileInputStream fin=new FileInputStream("ser.txt");
		ObjectInputStream o2=new ObjectInputStream(fin);
		Employee e1=(Employee)o2.readObject();
		System.out.println(e1);
		
	}

}
