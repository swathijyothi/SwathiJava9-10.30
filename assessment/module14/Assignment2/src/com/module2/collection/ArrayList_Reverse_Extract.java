package com.module2.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Reverse_Extract {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("green");
		a.add("red");
		a.add(10.988);
		a.add('S');
		a.add('w');
		a.add("blue");
		System.out.println(a);
		System.out.println("Reverse List");
		
		Collections.reverse(a);
	System.out.println(a);
	// extract a portion of an array list
	System.out.println("after extracting a portion of an array list"+a.subList(2, 5));
	}

}
