package com.module2;

import java.util.Scanner;

public class Throweg {
	void check(int age) throws Exception {
		if(age>18) {
			System.out.println("eligible for vote");
		}else {
			throw new Exception("not eligible");
		}
	}
	public static void main(String[] args) {
		try {int age;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the age");
			 age= sc.nextInt();
			 Throweg t= new Throweg();
			 t.check(age);
		}catch(Exception e) {
			e.printStackTrace();
			
		

}
}
}