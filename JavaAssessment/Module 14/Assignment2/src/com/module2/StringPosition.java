package com.module2;

import java.util.Scanner;

public class StringPosition {
	public void findchar(String s) {
		
	System.out.println("character at position 0 is:"+s.charAt(0));	
	}
	
public static void main(String[] args) {
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringPosition sp=new StringPosition();
	sp.findchar(s);
	String s1="Tops Technologies!";
	System.out.println("character at position 0 is: "+s1.charAt(0));
	System.out.println("character at position 10 is: "+s1.charAt(10));
}
}
