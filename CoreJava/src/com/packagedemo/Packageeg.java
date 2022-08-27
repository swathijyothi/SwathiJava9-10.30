package com.packagedemo;

import java.util.Scanner;

public class Packageeg {
	public static void main(String[] args) {
		try {
		System.out.println("code start");
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		c=a/b;
		System.out.println("division of a/b="+c);
		System.out.println("code end");
	}catch(Exception e) {
		System.out.println("exception caught");
	}
	}
}
