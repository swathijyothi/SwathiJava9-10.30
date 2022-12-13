package com.module2.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterateArrayList {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		
		list.add("swathi");
		
		list.add(10.12);
		list.add('s');
		list.add(null);
		list.add(true);
		list.add(15.0099);
		list.add(10);
		System.out.println(list);
		// insert an element into the array list at the first position.
		list.add(1, 10);
		
		//retrieve an element (at a specified index) from a given array list.
		System.out.println("element at possition 5 is :"+list.get(5));
		// update specific array element by given element
		list.set(4, "element");
		System.out.println(list);
		// remove the third element from an array list
		list.remove(3);
		System.out.println(list);
		//search an element in an array list
	System.out.println(	list.contains("swathi"));
	System.out.println(list.contains("ahaan"));
	}

}
