package com.module2;

import java.util.Scanner;

public class CountCharSpaceDigit {
	public static void main(String[] args) {
		int c=0,sp=0,n=0,o=0,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		for(i=0;i<s.length();i++)
		{
			char [] ch=s.toCharArray();
			if(Character.isLetter(ch[i]))
			{
				c++;
			}
			else if(Character.isDigit(ch[i])) {
				n++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				sp++;
			}
			else {
				o++;
			}
		}
		System.out.println("number of character in given string:"+c);
		System.out.println("number of number in given string:"+n);
		System.out.println("number of white space in given string:"+sp);
		System.out.println("number of other character in given string:"+o);
	}

}
