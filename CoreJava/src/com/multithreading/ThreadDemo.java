package com.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("my thread");
		t.setPriority(8);
		System.out.println(t);
	}

}
