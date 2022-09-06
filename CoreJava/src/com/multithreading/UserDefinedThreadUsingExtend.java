package com.multithreading;

class MyThread extends Thread{
	Thread t;

	public MyThread() {
		super("child thread");
		
		start();
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(this+":"+i);
		
			try {
				t.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println("thread exiting");
	}
}
	



public class UserDefinedThreadUsingExtend {
	public static void main(String[] args) {
		new MyThread();
		
	}
	

}
