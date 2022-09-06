package com.multithreading;
class UserThread implements Runnable{
 
	Thread t;
	

	public UserThread() {
		t=new Thread(this+"child Thread");
		t.start();
	}


	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println(t+":"+i);
		
			try {
				t.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println("thread exiting");
	}	
		
		
		
		
		
		
		
	}
	
	

public class UserDefinedThreadUsingInterface {
	public static void main(String[] args) {
		new UserThread();
	}

}
