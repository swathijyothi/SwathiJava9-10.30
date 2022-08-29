package com.errorhandling;

import java.util.Scanner;

public class ThrowDemo {
	public static void method() {
		try {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("square of a="+(a*a));
		}else {
			throw new Exception("please enter + value");
	
		}
		}
		catch(Exception e) {
			System.out.println("error:"+e);
			method();
		}
	}
	public static void main(String[] args) {
		method();
	}

}
