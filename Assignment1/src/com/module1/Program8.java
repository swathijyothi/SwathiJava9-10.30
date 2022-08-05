package com.module1;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		long a;
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		a=sc.nextLong();
	
	while(a!=0)
		{
	
a= (a/10);
		count++;
		}
		System.out.println("count="+count);
	}

}
