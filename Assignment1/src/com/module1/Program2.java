package com.module1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		char ch;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the charecter");
		ch=sc.next().charAt(0);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("\n"+ch+"is a vowel");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>=0||ch<=9) )
		{
			System.out.println("wrong input");
		}
		else 
		{
			System.out.println("\n"+ch+"is consonent");
		}
	}

}
