package com.module2;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mark;
		System.out.println("Enter the Mark:");
		mark=sc.nextInt();
		if(mark>=91&&mark<=100) {
			System.out.println("Grade :AA");
		}
		else if(mark>=81&&mark<=90) {
			System.out.println("Grade : AB");
		}
		else if(mark>=71&&mark<=80) {
			System.out.println("Grade :BB");
		}else if(mark>=61&&mark<=70){
			System.out.println("Grade BC");
		}else if(mark>=51&&mark<=60) {
			System.out.println("Grade CD");
		}else if(mark>=41&&mark<=50) {
			System.out.println("Grade DD");
		}else {
			System.out.println("---Fail!---");
		}
			
				
	}

}
