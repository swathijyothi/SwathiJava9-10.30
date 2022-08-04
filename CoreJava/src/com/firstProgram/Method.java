package com.firstProgram;

import java.util.Scanner;

public class Method {
	int a,b;
	Scanner sc=new Scanner(System.in);
	void getValue() {
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		
	}
	void show() {
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a+b="+(a+b));
		
	}
	public static void main(String[] args) {
		Method m=new Method();
		m.getValue();
		m.show();
		
	}

}
