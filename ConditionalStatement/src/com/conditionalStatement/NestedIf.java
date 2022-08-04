package com.conditionalStatement;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		if(a>b) {
			 if(a>c) {
				 System.out.println(a+"\t is greater");
			 }
			 else {
				 System.out.println(c+"\t is greater");
			 }
		}
		else {
			if(b>c) {
				System.out.println(b+"\t is greater");
			}
			else {
				System.out.println(c+"\t is greater");
			}
		}
	}

}
