package com.module2;
abstract class  Shape{
	abstract void RectangleArea(int l,int b);
	abstract void SquareArea(int a);
	abstract void CircleArea(double r);
}
class Area extends Shape{

	@Override
	void RectangleArea(int l, int b) {
		System.out.println("Area of Rectangle="+(l*b));
		
	}

	@Override
	void SquareArea(int a) {
		System.out.println("Area of Square:"+(a*a));
		
	}

	@Override
	void CircleArea(double r) {
		System.out.println("Area of Circle:"+(3.14*r*r));
		
	}
	
}
public class FindAreas {
	public static void main(String[] args) {
		Area a=new Area();
		a.RectangleArea(10, 4);
		a.CircleArea(5);
		a.SquareArea(6);
	}

}
