package com.module2;

public class Triangle {
	int a;
	int b;
	int c;
	
	 Triangle() {
		a=5;
		b=4;
		c=3;
	}
void findArea() {
	int s=((a+b+c)/2);
	int ar=(s*(s-a)*(s-b)*(s-c));
	double area=Math.sqrt(ar);
	System.out.println("area of Triangle:"+area);
}
void findPerimeter() {
	System.out.println("perimeter of triangle:"+(a+b+c));
}
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.findPerimeter();
		t.findArea();
	}

}
