package com.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArraylist {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("swathi");
		al.add("ahaan");
		
		al.add("10");
		
		System.out.println("element at index 1:"+al.get(1));
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
