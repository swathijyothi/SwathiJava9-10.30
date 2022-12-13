package com.module2;

public class Substringdemo {
	public static void main(String[] args) {
		String s1="Red is favorite color";
		String s2="Orange is also my favorite color";
		
		System.out.println(s1.substring(0, 3));
		System.out.println(s1.contains("red"));
		boolean b1=s1.startsWith("Red");
		boolean b2=s2.startsWith("Red");
		System.out.println("Red is favorite color   : start with Red:\n"+b1);
		System.out.println("Orange is also my favorite color  :start with Red:\n"+b2);
	}

}
