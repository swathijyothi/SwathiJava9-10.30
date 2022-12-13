package com.module2;

import java.util.Scanner;

public class Vowels
{
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch;
	System.out.println("enter the character");
	ch=sc.next().charAt(0);
	try {
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='o'||ch=='O'||ch=='u'||ch=='U'||ch=='i'||ch=='I')
		{
			System.out.println(ch +"  is a vowel");
		}
		else if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
		{
			System.out.println(ch +"  is a consonant ");
		}
		
		else {
			throw new Exception("enter character");
			
		}
	}catch(Exception e) {
		System.out.println("error"+e);
	
	}
	
}
}
