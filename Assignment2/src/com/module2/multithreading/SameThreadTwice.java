package com.module2.multithreading;
class TestThreadTwice extends Thread{
	Thread t=new Thread();
	public void run() {
		System.out.print("[");
		for(int i=0;i<5;i++) {
			System.out.print(i+" ");
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			t.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.print("]");
	}
	
	
}
public class SameThreadTwice {
	public static void main(String[] args) {
	TestThreadTwice t1= new TestThreadTwice();
	t1.start();
	t1.start();
	}

}
