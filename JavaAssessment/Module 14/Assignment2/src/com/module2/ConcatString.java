package com.module2;

import java.util.Scanner;

public class ConcatString {
	public static void main(String[] args) {
		System.out.println("concatenation using + operator:");
		String s1="Hello"+" "+"Welcome"+" ";
		System.out.println(s1);
		Scanner sc= new Scanner(System.in);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.println("enter string2:");
		String s2= sc.next();
		
		String s4=s1.concat(s2);
		System.out.println("using concat method:");
		System.out.println(s4);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.println("using string builder:");
		StringBuilder s3= new StringBuilder("Hiiii  ");
		StringBuilder s5=new StringBuilder(s2);
		StringBuilder s6=s3.append(s5);
		System.out.println(s6.toString());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.println("using format specifier");
	  String s7=String.format("%s%d%c", s1,435,'a');
	  System.out.println(s7.toString());
	  System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	  System.out.println("string join method:");
	  String s8=String.join(" ", s1,s4);
	  System.out.println(s8.toString());
	  
	  
	}

}
