package com.errorhandling;

import java.util.Scanner;

public class TryDemo {
	public static void main(String[] args) {
		try {
		System.out.println("program started");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a");
		int a= sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		int c=(a/b);
		System.out.println("c="+c);
		System.out.println("program end");
		}
		catch(Exception e) {
			System.out.println("exception caught");
		}
		
		
		
	}

}
