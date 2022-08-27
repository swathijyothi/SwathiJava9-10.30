package com.coreJava;

import java.util.Scanner;

class addition{
	
int add(int x,int y) {
	return x+y;
	
}
}
class timeConvertion{
	int time(int t) {
		return t*60;
		
	}
	
}
class increment{
	increment(int i){
		System.out.println("increment value="+(i+1));
	}
}

public class Sum {
	public static void main(String[] args) {
		addition a=new addition();
	System.out.println(" addition of a+b="+a.add(10, 8));
	System.out.println("enter the time in minutes");
	Scanner sc= new Scanner(System.in);
	int t = sc.nextInt();
	timeConvertion c= new timeConvertion();
	System.out.println("time in second="+c.time(t));
	System.out.println("enter the no:");
	int i=sc.nextInt();
	increment i1=new increment(i);
	
	}

}
