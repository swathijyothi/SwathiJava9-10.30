package com.generics;

public class genericDemo {
	
	public static <E> void inputArray(E[] PrintArray)
	{
		for(E e:PrintArray) {
			System.out.print(" "+e);
		}System.out.println( );
	}
	
	
	
	public static void main(String[] args) {
		Integer intarray[]= {1,3,5,6,7};
		inputArray(intarray);
		Double doublearray[]= {5.6,8.9,9.7,8.6};
		inputArray(doublearray);
		Character chararray[]= {'a','b','c'};
		inputArray(chararray);
	}

}
