package com.module2.multithreading;
class thread1 implements Runnable{
Thread t=new Thread();

	public thread1() {
	t = new Thread(this);
	
	t.start();
}

	@Override
	public void run() {
		
		System.out.println("Runnable");
		try {
		for(int i=0;i<5;i++) {
			System.out.println("hello");
			
				t.sleep(2000);
			}} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

public class ImplementRunable {
public static void main(String[] args) {
	thread1 t1=new thread1();
	
}
}
