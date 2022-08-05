package com.module1;

import java.util.Scanner;

public class Program10Ascii {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		char ch=sc.next().charAt(0);
		System.out.println("Ascii value of"+ch+" ="+(int)ch);
	}

}
