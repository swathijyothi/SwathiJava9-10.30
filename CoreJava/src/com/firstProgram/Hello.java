package com.firstProgram;

public class Hello {
	 void show(){
		System.out.println("call from main method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello");
		Hello v= new Hello();
		v.show();
		System.out.println("main method");
	}

}
