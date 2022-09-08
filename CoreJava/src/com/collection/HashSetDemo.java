package com.collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add(10);
		hs.add(13.21);
		hs.add("string122");
		hs.add('k');
		hs.add(10);
		hs.add(true);
		System.out.println(hs);
	}

}
