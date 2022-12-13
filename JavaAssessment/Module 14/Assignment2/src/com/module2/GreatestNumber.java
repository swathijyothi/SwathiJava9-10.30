package com.module2;

import java.util.Scanner;

public class GreatestNumber {
	
	 public void  greater(int a,int b,int c)
	 {
	if(a>b)
	{
		if(a>c) 
		{
			System.out.println(a+" is greater");
		}
	}
	else 
	{
		if(b>c) 
		{
			System.out.println(b+" is greater");
		}
		else {
			System.out.println(c+" is greater");
		}
	}
		 
		 
		 
		 
	 }
	
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a:");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		System.out.println("enter c");
		c=sc.nextInt();
		GreatestNumber n= new GreatestNumber();
		n.greater(a,b,c);
	}

}
