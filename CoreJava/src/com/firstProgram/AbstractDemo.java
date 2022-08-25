package com.firstProgram;


abstract class abs{
	abstract void method1();
	void method2()
	{
		System.out.println("non abstract method");
	}
}
class AB extends abs{

	@Override
	void method1() {
	System.out.println("abstract method calling");
		
	}
	
}
public class AbstractDemo {
	public static void main(String[] args) {
		AB a= new AB();
		a.method1();
		a.method2();
	}

}
