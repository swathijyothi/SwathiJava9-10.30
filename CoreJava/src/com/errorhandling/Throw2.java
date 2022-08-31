package com.errorhandling;

import java.util.Scanner;

public class Throw2 {
	public static void method (int a) throws Exception{
	if(a>0)	{
		System.out.println("square="+(a*a));
	}else {
		throw new Exception("enter +no");
	}
	}
	
	public static void main(String[] args) {
		System.out.println("enter a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		try {
			method(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
