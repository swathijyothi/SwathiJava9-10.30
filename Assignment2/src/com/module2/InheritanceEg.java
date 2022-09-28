package com.module2;


class parent{
	void printParent() {
		System.out.println("this is parent class");
	}
}
class child1 extends parent{
	void printChild() {
		System.out.println("This is child class");
	}
	
}


public class InheritanceEg {
	public static void main(String[] args) {
		parent p= new parent();
		child1 c=new child1();
		p.printParent();
		c.printChild();
		c.printParent();
	}

}
