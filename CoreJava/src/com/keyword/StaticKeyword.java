package com.keyword;

import java.util.Scanner;

public class StaticKeyword {
	static int a;
	void get()
	{
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
	}
    void show() {
    	System.out.println("A="+a);
    	System.out.println("A="+a);
    	System.out.println("A="+a);
    }
    public static void main(String[] args) {
		StaticKeyword s1=new StaticKeyword();
		StaticKeyword s2=new StaticKeyword();
		StaticKeyword s3=new StaticKeyword();
		s1.get();
		s2.get();
		s3.get();
		s1.show();
		s2.show();
		s3.show();
	}
}
