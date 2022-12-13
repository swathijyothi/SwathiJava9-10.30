package com.module2.errorhandling;

public class NameNotValid extends Exception{
	String name;

	public NameNotValid(String name) {
		
		this.name = name;
	}
	

}
