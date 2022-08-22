package com.coreJava;

import java.util.Scanner;

public class OneDarray {
	int i,j;
	void assending(int a[]) {
		
		for(i=0;i<10;i++) {
			for(j=i+1;j<10;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}  System.out.println(); 
		for(i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	void descending(int a[]) {
		for(i=0;i<10;i++) {
			for(j=i+1;j<10;j++) {
				if(a[i]<a[j]) {
					int temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
					
				}
			}
		}System.out.println("descending order");
		for(i=0;i<10;i++) {
			System.out.print(a[i]+"  ");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elements");
	int i;
	int a[]=new int [10];
	for( i=0;i<10;i++)
	{
		a[i]=sc.nextInt();
	}
	
	OneDarray o=new OneDarray();
	o.assending(a);
	o.descending(a);
}
}
