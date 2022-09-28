package com.module2;

import java.util.Scanner;

abstract class Mark{
	abstract double GetPercentage();
}
class StudentA extends Mark{
   int m1,m2,m3;
   
	public StudentA(int m1, int m2, int m3) {
	
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
}


	@Override
	double GetPercentage() {
		double p=((m1+m2+m3)/3);
		return p;
	}
	
}
class StudentB extends Mark{
double  m1,m2,m3,m4;

	public StudentB(double m1, double m2, double m3, double m4) {
	
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
	this.m4 = m4;
}

	@Override
	double GetPercentage() {
		double p= ((m1+m2+m3+m4)/4);
		return p;
	}
	
}
public class MarkPercentage {
	public static void main(String[] args) {
		
	StudentA a=new StudentA(80,79,98);
	System.out.println("percentage obtained by student A is  "+	a.GetPercentage());
	StudentB b=new StudentB(34,70,73,80);
	System.out.println("percentage obtained by student B is "+b.GetPercentage());
		
	}

}
