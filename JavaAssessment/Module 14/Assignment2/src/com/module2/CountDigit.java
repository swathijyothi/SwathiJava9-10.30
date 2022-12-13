package com.module2;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		long n,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(  "Enter the number :  ");
		n=sc.nextLong();
		int c=0;
		do {
			rem=(n%10);
			n=n/10;
			c++;
			
		}while(n!=0);
		System.out.println(c);
	}

}
