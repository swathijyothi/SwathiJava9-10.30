package com.firstProgram;

import java.util.Scanner;

public class BasicProgram {
	public static void main(String[] args) {
		System.out.println("wellcome to java program");
		Scanner sc=new Scanner(System.in); 
		int a,b;
		String name;
		System.out.println("Enter a:");
	a=	sc.nextInt();
	System.out.println("\nEnter b:");
	b=sc.nextInt();
	System.out.println("\nEnter name:");
	name=sc.next();
	System.out.println("name="+name);
	System.out.println("Addition of a+b="+(a+b));
	System.out.println("Subtraction: a-b="+(a-b));
	System.out.println("multiplication:a*b="+(a*b));
	float c= (float)(a/b);
	System.out.println("division:a/b="+c);
	System.out.println("\n"+a/(float)b);
		
	}

}
