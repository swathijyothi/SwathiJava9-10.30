package com.firstProgram;

class A{
	
int	l=10;
int	b=90;
void show() {
	System.out.println("Parent Class");
	System.out.println("length="+l+"\t "+"breadth="+b);

	}
}

class B extends A{
	void display() {
		
	
	System.out.println("Child class");
	System.out.println("Area of Rectangle="+l*b);
}
}

public  class SingleInheritance {
	public static void main(String[] args) {
		B b=new B();
		b.show();
		b.display();
		System.out.println("length="+b.l);
		
	}

}
