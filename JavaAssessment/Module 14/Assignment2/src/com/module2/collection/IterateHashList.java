package com.module2.collection;

import java.util.HashSet;
import java.util.Iterator;



public class IterateHashList {
	public static void main(String[] args) {
		HashSet<String>hl=new HashSet<String>();
		
		          hl.add("Red");
		          hl.add("Green");
		          hl.add("Black");
		          hl.add("White");
		          hl.add("Pink");
		          hl.add("Yellow");

		   // print the hash set
		   System.out.println("The Hash Set: " + hl);
		   //ITERATE
		   System.out.println(" iterate through all elements in a hash list");
		   Iterator it=hl.iterator();
		   while(it.hasNext()) {
			   System.out.println(it.next());
		   }
	}

}
