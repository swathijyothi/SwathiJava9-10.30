package com.loop;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		int n;
		int i,j,sp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
n= sc.nextInt()	;
 System.out.println(" pattern");
 for(i=0;i<n;i++) {
	 for(sp=0;sp<=(n-i);sp++) {
		 System.out.print(" ");
	       }
	 for(j=0;j<=i;j++)
	 {
		 System.out.print(" *");
	 }
	 
	 System.out.println();
	 
	 
 }

		
	}

}
