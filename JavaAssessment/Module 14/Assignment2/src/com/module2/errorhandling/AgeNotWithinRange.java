package com.module2.errorhandling;

public class AgeNotWithinRange extends Exception{
	int age;

	public AgeNotWithinRange(int age) {
		
		this.age = age;
	}
	

}
