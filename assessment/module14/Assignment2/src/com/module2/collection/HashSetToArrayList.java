package com.module2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArrayList {
	public static void main(String[] args) {
		HashSet hs=new HashSet<>(Arrays.asList("swa",12,32,"ahaan","jyothi"));
		System.out.println("Hash Set: "+hs);
		System.out.println("HashSet to ArrayList:");
		ArrayList a1=new ArrayList<>(hs);
		System.out.println(a1);
		
	}

}
