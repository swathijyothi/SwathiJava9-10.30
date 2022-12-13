package com.module2;

import java.util.Scanner;

public class Factorial {
	
	 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,i,f=1;
	System.out.println("Enter the number");
	n=sc.nextInt();
	if(n==0) {
	System.out.println("Factorial of 0!=0");	
	}else {
		
	
	for(i=1;i<=n;i++) {
		f=f*i;
	}
	System.out.println("Factorial of "+n+" is "+f);
	}
}
}

