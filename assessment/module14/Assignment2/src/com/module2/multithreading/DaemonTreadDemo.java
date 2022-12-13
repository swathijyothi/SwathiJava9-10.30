package com.module2.multithreading;

public class DaemonTreadDemo extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Is working");
		}
		else {
			System.out.println("user thread id working");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		DaemonTreadDemo d1=new DaemonTreadDemo();
		DaemonTreadDemo d2=new DaemonTreadDemo();
		DaemonTreadDemo d3=new DaemonTreadDemo();
		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
		
	}

}
