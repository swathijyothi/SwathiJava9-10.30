package com.module2;
class Rectangle1{
	static int length;
	static int breadth;
	public Rectangle1(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	void findArea() {
		System.out.println("area of rectangle:"+(length*breadth));
	}
	void findPerimeter() {
		System.out.println("perimeter of rectangle:"+(2*(length+breadth)));
	}
}
class Square1 extends Rectangle1 {
int side;

public Square1(int side) {
	super(10,40);
	this.side = side;
}
	void findArea() {
		super.findArea();
		System.out.println("area of square: "+(side*side));
	}
void findPerimeter() {
	super.findPerimeter();
	System.out.println("perimeter of square:"+(2*side));
}
	
}
public class SquareInheritRectangle {
	public static void main(String[] args) {
		
	
Square1 s= new Square1(10);
s.findArea();
s.findPerimeter();

}
}