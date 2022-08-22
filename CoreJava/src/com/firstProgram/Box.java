package com.firstProgram;

public class Box {
	double length,breadth,width;
	Box(){
		System.out.println("DEFAULT CONSTRUCTOR");
		length =10;
		width=4.5;
		breadth=80;
	}
	void display() {
		System.out.println("volume of box="+length*width*breadth);
	}
	Box(double l,double w,double b)
	{
		length=l;
		breadth=b;
		width=w;
		
		System.out.println("PARAMETERIZED CONSTRUCTOR");
		System.out.println("l="+l+"b="+b+"w="+w);
	}
	Box(Box c){
		
		System.out.println("COPY CONSTRUCTOR");
		length=c.length;
		width=c.width;
		breadth=c.breadth;
	}
	
	
	public static void main(String[] args) {
		Box b1=new Box();
		b1.display();
		Box b2=new Box(5,8,4);
		b2.display();
		Box b3=new Box(b1);
		b3.display();
		Box b4=new Box(b2);
		b4.display();
		
	}

}
