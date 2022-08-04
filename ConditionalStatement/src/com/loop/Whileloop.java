package com.loop;

public class Whileloop {
	public static void main(String[] args) {
		int i=1;
		int j=10;
		System.out.println("print number 1 to 10\n");
		while(i<=10) {
			System.out.println("\t "+i);
			i++;
		}
		//do while
		do {
			System.out.println("\t"+j);
			j--;
		}while(j>0);
		//for loop
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
	}

}
