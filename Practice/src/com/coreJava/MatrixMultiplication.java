package com.coreJava;

import java.util.Scanner;

public class MatrixMultiplication {
	void multiply(int r1,int c1,int r2,int c2,int a[][],int b[][]) {
		int c[][]= new int[100][100];
		int i,j,k;
		for(i=0;i<r1;i++) {
			for(j=0;j<c2;j++) {
				for(k=0;k<r2;k++) {
				c[i][j]=c[i][j]+(a[i][j]*b[k][j]);
			}
		}
	}System.out.println("matrix multiplication");
		for(i=0;i<r1;i++) {
			for(j=0;j<c2;j++) {
				System.out.print(c[i][j]+"  ");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		int i,j,r1,r2,c1,c2;
		int a[][]= new int[100][100];
		int b[][]= new int[100][100];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row");
		r1=sc.nextInt();
		System.out.println("enter column");
		c1=sc.nextInt();
		System.out.println("enter row");
		r2=sc.nextInt();
		System.out.println("enter column");
		c2=sc.nextInt();
		MatrixMultiplication m=new MatrixMultiplication();
		if(c1==r2) {
			System.out.println("matrix 1");
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++) {
					a[i][j]=sc.nextInt();
				}
			}System.out.println("matrix 2");
			for(i=0;i<r2;i++) {
				for(j=0;j<c2;j++) {
					b[i][j]=sc.nextInt();
				}
			}
			m.multiply(r1,c1,r2,c2,a,b);
		}
	else {
			System.out.println("multiplication not possible");
	
			}
	}

	
		
	}


