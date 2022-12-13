package com.module2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Compare2Array {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		ArrayList<Integer>a2=new ArrayList<Integer>(Arrays.asList(1,23,43,32));
		Scanner sc=new Scanner(System.in);
		a1.add(10);
		a1.add(32);
		a1.add(3);
		a1.add(32);
		a1.add(30);
		
		System.out.println("ArrayList 1:"+a1);
		System.out.println("ArrayList 2:"+a2);
		
		boolean b=a1.equals(a2)	;
		if(b==true)	{
			System.out.println("ArrayList is Equall");
		}else {
			System.out.println("ArrayList Not Equal");
		}
		ArrayList<Integer>a3=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println("ArrayList3:"+a3);
		ArrayList<Integer>a4=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println("ArrayList4:"+a4);
		boolean b1=a3.equals(a4)	;
		if(b1==true)	{
			System.out.println("ArrayList is Equal");
		}else {
			System.out.println("ArrayList Not Equal");
		}
		
	}

	
}
