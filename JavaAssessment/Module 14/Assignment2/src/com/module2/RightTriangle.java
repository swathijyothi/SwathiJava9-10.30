package com.module2;

import java.util.Scanner;

public class RightTriangle {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter the limit");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}
		
	}

}
