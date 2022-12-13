package com.module2;

public class OverridingEg {
	
	public void print(int n,char c) {
		System.out.println("print integer:"+n);
		System.out.println("print char:"+c);
	}
	public void print(char c,int n) {
		System.out.println("print char:"+c);
		System.out.println("print integer:"+n);
		
	}
	
	public static void main(String[] args) {
		OverridingEg e=new OverridingEg();
		e.print('a', 100);
		e.print(200, 'A');
	}

}
