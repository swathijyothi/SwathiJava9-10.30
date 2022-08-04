package com.conditionalStatement;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		System.out.println("Enter a");
		a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println(a+ "is positive");
		}
		else {
			System.out.println(a+ "is negative");
		}
	}

}
