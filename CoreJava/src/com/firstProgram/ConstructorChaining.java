package com.firstProgram;
class A1{
	A1(){
		System.out.println("A1 constructor called");
	}
	void show() {
		
		System.out.println("show from A");
	}
}
class B2 extends A1{
	B2(){
		System.out.println("B2 constructor called");
	}
	void show() {
		super.show();
		System.out.println("show from B");
	}
}
class C2 extends B2{
	C2(){
		System.out.println("c2 constructor called");
	}
	void show() {
		super.show();
		System.out.println("show from C");
	}
}
public class ConstructorChaining {
public static void main(String[] args) {
	C2 c=new C2();
	c.show();
	C2 b=new C2();
	
}
}
