package com.module2;

import java.util.Scanner;

public class SumAndAvg {
	int i,sum=0;
	int [] num= new int [5];
	public void getNumbers() 
	{
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("enter the numbers");
		for(i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
			
		}
	
	}
	
	public void findSumAvg()
	{
		
		for(i=0;i<5;i++) 
		{
			sum=sum+num[i];
		}System.out.println("sum of 5 no:"+sum);
		System.out.println("average of 5 no:"+(sum/5));
	}
	
	public static void main(String[] args) {
	SumAndAvg s=new SumAndAvg()	;
	s.getNumbers();
	s.findSumAvg();
	}

}
