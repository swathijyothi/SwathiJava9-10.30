package com.module2;

public class Member {
	
	String Name; 
	int Age ;
	long Phone_number ;
	String Address;
	double Salary;
	
	
	public void GetSalary(Member m) {
		System.out.println(m.Salary);
	}
	
	



	public static void main(String[] args) {
		Member m1=new Member();
		m1.Name="swathi";
		m1.Age=28;
		m1.Phone_number=21344555;
		m1.Address="swathisadanam";
		m1.Salary=50000;
		
		Member m2=new Member(); 
		m2.Name="ahaan";
		m2.Age=23;
		m2.Phone_number=213000555;
		m2.Address="samyaka";
		m2.Salary=80000;
		System.out.println("salary of member1:");
		m1.GetSalary(m1);
		System.out.println("salary of member2");
		m2.GetSalary(m2);
		}
	}

