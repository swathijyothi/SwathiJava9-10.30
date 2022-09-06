package com.multithreading;


class table{
synchronized	void PrintTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.print(n*i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}System.out.println();
	}
}
class Table5 implements Runnable{
table f;
Thread th;
	
	public Table5(table f) {
	
	this.f = f;
	th= new Thread(this);
	th.start();
}


	public void run() {
		f.PrintTable(5);
		
	}


	
}
class Table9 extends Thread{
	table f1;

	public Table9(table f1) {
		
		this.f1 = f1;
	}
	public void run() {
		f1.PrintTable(9);
	}
	
}
public class Synchronization2 {
	public static void main(String[] args) {
		table obj= new table();
		Table5 t2=new Table5(obj);
		Table9 t1= new Table9(obj);
		t1.start();
		
		
		
	
}

}
