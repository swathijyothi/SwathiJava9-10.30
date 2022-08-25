package com.keyword;

public class StaticMethod {
	static int a=10;
	static int b;
	static void method(int x)
	{
		System.out.println("X="+x);
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
static {
	System.out.println("static block initialized");
	b=4*a;
	
}
{
	System.out.println("block is initialized");
}
public static void main(String[] args) {
	StaticMethod s2=new StaticMethod();
	method(90);
	StaticMethod s1=new StaticMethod();
}
}
