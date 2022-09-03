package com.coreJava;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		System.out.println("TEMPERATURE CONVERTER");
		Scanner sc= new Scanner(System.in);
		System.out.println("select ");
		System.out.println("a)Celsius to Fahrenhit");
		System.out.println("b)Fahrenhit to Celsius");
		char c= sc.next().charAt(0);
		switch(c){
		case 'a':
			System.out.println("enter the temperature in celsius");
			float cel= sc.nextFloat();
			float f1=(cel*(9/5)+32);
			System.out.println("temperature in fahrenhit:"+f1);
		break;
		case 'b':
			System.out.println("Enter rhe temerature in farenhit");
			float fah= sc.nextFloat();
			float cel1=((fah-32)*(5/9));
			System.out.println("temperature in celsius:"+cel1);
			break;
			default:
				System.out.println("incorrect input");
			break;
		
		}
		
	}

}
