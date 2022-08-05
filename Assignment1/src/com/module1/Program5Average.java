package com.module1;

import java.util.Scanner;

public class Program5Average {
	public static void main(String[] args) {
		int a[] = new int[5];
		int i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for( i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
	//	("sum");
		for(i=0;i<5;i++) {
			 sum=sum+a[i];
			
		}
		System.out.println("sum of 5 element="+sum);
		//AVERAGE
	
		System.out.println("\nAverage="+sum/(float)5);
	}

}
