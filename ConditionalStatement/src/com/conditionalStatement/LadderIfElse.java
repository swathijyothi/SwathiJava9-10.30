package com.conditionalStatement;

import java.util.Scanner;

public class LadderIfElse {
	public static void main(String[] args) {
		int rollno;
		String name;
		int phy,math,chem;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Rollno:");
		rollno=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter physics mark");
		phy=sc.nextInt();
		System.out.println("Enter math mark");
		math=sc.nextInt();
		System.out.println("Enter chemistry mark");
		chem=sc.nextInt();
		int total=(phy+math+chem);
		float per=(float)total/3;
		System.out.println("Rollno:"+rollno);
	System.out.println("\n name:"+name);
	System.out.println("\n total mark:"+total);
	System.out.println("\n percentage:"+per);
	
	if(per>75)
	{
		System.out.println("DISTINCTION");
	}
	else if(per>60) {
		System.out.println("FIRST CLASS");
	}
	else if(per>50) {
		System.out.println("SECOND CLASS");
	}
	else if(per>40) {
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAILED");
	}
	}

}
