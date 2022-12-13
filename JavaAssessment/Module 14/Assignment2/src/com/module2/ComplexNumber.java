package com.module2;

import java.util.Scanner;
class Complex{
	int real;
	int img;
	public Complex(int real, int img) {
	
		this.real = real;
		this.img = img;
	}
	void printComplexNumber(int real,int img) {
		
		System.out.println(real+"+"+img+"i");
		
	}
	void add(Complex c1,Complex c2) {
		Complex temp=new Complex(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		System.out.println("addition of("+ c1.real+"+"+c1.img+"i) "+"+("+c2.real+"+"+c2.img+"i)"+" = "+temp.real+"+"+temp.img+"i");
	}
void Subtraction(Complex c1,Complex c2) {
	Complex temp=new Complex(0,0);
	temp.real=c1.real-c2.real;
	temp.img=c1.img-c2.img;
	System.out.println("subtraction of("+ c1.real+"+"+c1.img+"i) "+"-("+c2.real+"+"+c2.img+"i)"+" = "+temp.real+"+"+temp.img+"i");
}
void Multiplicatio(Complex c1,Complex c2) {
	Complex temp=new Complex(0,0);
	temp.real=c1.real*c2.real;
	temp.img=c1.img*c2.img;
	System.out.println("addition of("+ c1.real+"+"+c1.img+"i) "+"*("+c2.real+"+"+c2.img+"i)"+" = "+temp.real+"+"+temp.img+"i");
}
}
public class ComplexNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int real1,real2,img1,img2;
		System.out.println("enter real part");
		real1=sc.nextInt();
		System.out.println("enter imginary part");
		img1=sc.nextInt();
		System.out.println("enter real part");
		real2=sc.nextInt();
		System.out.println("enter imaginary part");
		img2=sc.nextInt();
		Complex c1= new Complex(real1,img1);
		Complex c2=new Complex(real2,img2);
		System.out.println("Complex Number1:");
		c1.printComplexNumber(real1, img1);
		System.out.println("Complex Number2:");
		c2.printComplexNumber(real2, img2);
	c1.add(c1, c2);
	c1.Subtraction(c1, c2);
	c1.Multiplicatio(c1, c2);
	}

	
		
	}


