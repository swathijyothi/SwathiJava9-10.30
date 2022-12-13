package com.module2.multithreading;
class A1 {

	
	
public void print() {
	System.out.println("thread1");
}
public void print2() {
	System.out.println("thread2");
}
	public void run() {
	
		
	}
	
}
class A2 implements Runnable{
A1 a;
Thread t1;
Thread t2;
	public A2(A1 a) {
	
	this.a = a;
	t1=new Thread(this);
	t2=new Thread(this);
	t1.start();
	t2.start();
}

	@Override
	public void run() {
		a.print();
		try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.print2();
		try {
			t2.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" 2 threads and execute that threads by providing sleep time as \r\n" + 
				"2000ms and check the execution");
	}
	
}
public class TwoTreadsleep {
	public static void main(String[] args) {
		A1 a=new A1();
		A2 b=new A2(a);
	
	}

}
