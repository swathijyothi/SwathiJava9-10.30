package com.module2.multithreading;
class shape{
	Thread t1=new Thread();
	int l,b;
	public shape(int l, int b) {
	
		this.l = l;
		this.b = b;
		
	
	}
	synchronized void area() {
		System.out.println("area of rectangle");
		try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(l*b);
	}
	
}
class Rectangle extends Thread{
	shape s1;

	public Rectangle(shape s1) {
	
		this.s1 = s1;
		
	}
	public void run(){
		s1.area();
	}
}
public class ExtendingThread {
	public static void main(String[] args) {
		shape s1=new shape(10,3);
		Rectangle r=new Rectangle(s1);
		r.start();
	}

}
