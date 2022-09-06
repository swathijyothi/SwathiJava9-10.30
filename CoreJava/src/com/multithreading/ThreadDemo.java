package com.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("before changing \n"+t);
		t.setName("my thread");
		System.out.println("after renaming \n"+t);
		t.setPriority(8);
		System.out.println("after changing priority \n"+t);
		
		for(int i=0;i<5;i++) {
			System.out.println(t+":"+i);
			
		}
		System.out.println("thread exiting");
		System.out.println("Thread one by one");
		try {
		for(int i=0;i<5;i++) {
			System.out.println(t+":"+i);
			
				Thread.sleep(2000);
		}
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


