package com.module2;

import java.util.Scanner;

public class RightTriagleNumberInc {
	public static void main(String[] args) {
		int n,m=1,i,j;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<i;j++) 
			{
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}


}


