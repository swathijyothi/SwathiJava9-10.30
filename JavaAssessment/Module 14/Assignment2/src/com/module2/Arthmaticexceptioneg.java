package com.module2;

import java.util.Scanner;

public class Arthmaticexceptioneg {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int a,b;
			System.out.println("enter a");
			a=sc.nextInt();
			System.out.println("enter b");
			b=sc.nextInt();
			float d=(float)(a/b);
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
