package com.loop;

public class Pyramid {
	public static void main(String[] args) {
		int sp;
		for(int i=0;i<10;i++)
		{
		for( sp=0;sp<=(10-i);sp++) {
			System.out.print(" ");
		}
		for(int j=0;j<=(2*i+1)-1;j++)
		{
			System.out.print("*");
		}
		System.out.println( );
		}
		
		
	}
	
}
