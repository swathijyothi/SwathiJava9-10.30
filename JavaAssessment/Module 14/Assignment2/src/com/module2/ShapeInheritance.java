package com.module2;
class shape1{
	void print() {
		System.out.println("This is a Shape");
	}
}
class Rectangle extends shape1{
	void print() {
		super.print();
		System.out.println("This is a Rectangle");
	}
}
class Circle extends shape1{
	 void print() {
		 super.print();
		System.out.println("This is a circle");

	}
}
class Square extends Rectangle{
	void print() {
		super.print();
		System.out.println("Square is a Rectangle");
	}
}
public class ShapeInheritance {
public static void main(String[] args) {
	Square s=new Square();
	s.print();
	Circle c=new Circle();
	c.print();
}
}
