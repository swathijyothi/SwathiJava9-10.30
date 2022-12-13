package com.module2;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
	

	Scanner sc= new Scanner(System.in);
	int year;
	boolean leap=false;
	System.out.println("Enter the year");
		year =sc.nextInt();
		if(year%4==0) 
		{
			if(year%100==0)
			{
				if(year%400==0) 
				{
					leap=true;
				}else
					leap=false;
			}else
				leap=true;
			
		}else
			leap=false;
		if(leap) {
			System.out.println(year+"\t is LEAP YEAR");
		}else {
			System.out.println(year +"\t is not a leap year");
		}
}

}
