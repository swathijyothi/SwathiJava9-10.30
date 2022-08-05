package com.module1;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the integer");
		int n=sc.nextInt();
		int s=(n*10)+n;
		int t=(n*100)+s;
		int sum=n+s+t;
		System.out.println("pattern:"+n+"+"+s+"+"+t);
				
	}

}
