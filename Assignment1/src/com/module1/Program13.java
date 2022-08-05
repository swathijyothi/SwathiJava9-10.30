package com.module1;

public class Program13 {
	public static void main(String[] args) {
		
		System.out.println("Number Divisible By 3");
		for(int i=1;i<100;i++)
		{
			if(i%3==0) {
				System.out.print(i+",");
				
			}	
		}
		System.out.println("\nNumber Divisible By 5");
		for(int i=1;i<100;i++)
		{
			if(i%5==0) {
				System.out.print(i+",");
				
			}	
		}
		System.out.println("\nNumber Divisible By 3 and 5");
		for(int i=1;i<100;i++)
		{
			if(i%3==0&&i%5==0) {
				System.out.print(i+",");
				
			}	
		}
	}

}
