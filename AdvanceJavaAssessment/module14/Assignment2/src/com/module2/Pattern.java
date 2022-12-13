package com.module2;

import java.util.Scanner;

public class Pattern {
	
	static void printPattern(int n) 
	{
		int i=0,j=0;
		i=(n*10)+n;
		j=(n*100)+i;
		System.out.println(n+"+"+i+"+"+j);
	}
	
	
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	printPattern(n);
}
}
