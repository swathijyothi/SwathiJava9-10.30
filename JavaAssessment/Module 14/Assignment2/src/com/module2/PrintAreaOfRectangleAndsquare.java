package com.module2;

import java.util.Scanner;

public class PrintAreaOfRectangleAndsquare {
	
	void printArea(int l,int b) {
		System.out.println("area of Rectangle = "+(l*b));
	}
	void printArea(int a) {
		System.out.println("area of Square = "+(a*a));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length:");
		int l=sc.nextInt();
		System.out.println("enter breadth:");
		int b=sc.nextInt();
		System.out.println("enter the side of square:");
		int a= sc.nextInt();
		PrintAreaOfRectangleAndsquare p= new PrintAreaOfRectangleAndsquare();
		p.printArea(l, b);
		p.printArea(a);
	}

}
