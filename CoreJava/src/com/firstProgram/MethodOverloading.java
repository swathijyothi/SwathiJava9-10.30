package com.firstProgram;
class CompileTimePolimorphism{
	
	int add(int a,int b) {
		return a+b;
		
	}
	float add(float a,float b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		CompileTimePolimorphism c= new CompileTimePolimorphism();
		System.out.println(c.add(10, 6));
		System.out.println(c.add(12.7f, 21.43f));
		System.out.println(c.add(10, 32, 32));
		
	}

}
