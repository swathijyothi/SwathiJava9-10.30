package com.firstProgram;
interface if1{
	void method1();
	static void method5(){
		System.out.println("static method called");
		
	}
	
	
}
interface if2 extends if1{
	void method2();
	static void method4(){
		System.out.println("static method called");
		
	}
	
}
class X implements if1,if2{

	@Override
	public void method2() {
		
		System.out.println("if1 is calling");
	}

	@Override
	public void method1() {
		System.out.println("if2 is calling");
		
		
	}
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	X x=new X();
	x.method1();
	x.method2();
	if2.method4();
	if1.method5();
	
}
}
