package com.multithreading;

class caller{
	public void call(String msg)
	{
		System.out.print("["+msg);
	
	try 
	{
		Thread.sleep(1000);
	}
	catch(Exception e){
		
		e.printStackTrace();
	}System.out.println("]");
}
}
class call implements Runnable{
	Thread t;
	String msg;
	caller c;
	public call(String msg, caller c) {
		
		this.msg = msg;
		this.c = c;
		t=new Thread(this);
		t.start();
		
	}
	public void run() 
	{
		synchronized(c){
		c.call(msg);
	}
	}
	
}
public class SynchrinizationDemo {
	public static void main(String[] args) {
		caller c= new caller();
		call c1= new call("HELLO",c);
		call c2= new call("world",c);
		call c3= new call("SYNCHRONIZATION",c);
	}

}
