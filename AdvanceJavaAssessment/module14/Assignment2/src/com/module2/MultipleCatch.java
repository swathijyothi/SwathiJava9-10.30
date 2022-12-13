package com.module2;


import java.util.Scanner;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int a,b;
			System.out.println("enter a");
			a=sc.nextInt();
			System.out.println("enter b");
			b=sc.nextInt();
			double c=(double)(a/b);
			int [] array=new int[5];
			System.out.println("enter the array");
			for(int i=0;i<5;i++) {
				array[i]=sc.nextInt();
					}
			
				System.out.println(array[5]);
			
		}catch( ArithmeticException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
