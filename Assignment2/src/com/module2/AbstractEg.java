package com.module2;

abstract class P{
abstract void message()	;
void message1() {
	System.out.println("this is parent class using non abstract method");
}
}
class childa extends P{

	@Override
	void message() {
		System.out.println("This is child class 1");
		
	}
	
	
}
class childb extends P{

	@Override
	void message() {
		System.out.println("this is child class 2");
		
	}
	
}
public class AbstractEg {
	public static void main(String[] args) {
	childa c1=new childa();
	childb c2=new childb();
	c1.message1();
	c1.message();
	c2.message();
	c2.message1();
	}

}
