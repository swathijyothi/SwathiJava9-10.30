package com.module2.collection;

import java.util.HashMap;

public class KeyValueEmptyInHashMap {
	public static void main(String[] args) {
		HashMap hm=new HashMap<>();
		hm.put(1, "swa");
		hm.put(2, "ahaan");
		hm.put(3, "jyothi");
		hm.put(4, "sujith");
		System.out.println("hash map:"+hm);
	System.out.println("whether a map contains key-value 4?" + hm.containsKey(4));
	System.out.println("whether a map contains key-value 10?" + hm.containsKey(10));
	}

}
