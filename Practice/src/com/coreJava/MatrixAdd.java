package com.coreJava;

import java.util.Scanner;

public class MatrixAdd {
	int i,j;
	int c1,r1,c2,r2;
	int a[][]=new int[100][100];
	int b[][]=new int[100][100];
	int c[][]=new int[100][100];
	void getMatrrix() {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the column");
		c1=sc.nextInt();
		System.out.println("enter row");
		r1=sc.nextInt();
		System.out.println("enter the column");
		c2=sc.nextInt();
		System.out.println("enter row");
		r2=sc.nextInt();
		
		if(r1==r2&&c1==c2) {
		System.out.println("matrix A");
		for(i=0;i<r1;i++) {
			for(j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix B");
		for(i=0;i<r2;i++) {
			for(j=0;j<c2;j++)
			{
			b[i][j]=sc.nextInt();
			}
		}}
		else {
			System.out.println("matrix addition not possible");
		}
	}
	void add() {
		
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			
			
		}
	
			
		
		
	
	void display() {
		for(i=0;i<r1;i++) {
			for(j=0;j<c1;j++) {
				System.out.print(c[i][j]+"  ");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		MatrixAdd m=new MatrixAdd();
		m.getMatrrix();
		
		m.add();
		m.display();
		
		
	}

}
