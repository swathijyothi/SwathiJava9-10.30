package com.module2.collection;

import java.util.HashMap;

public class HashMap_NOofKey {
	public static void main(String[] args) {
		HashMap hp=new HashMap();
		hp.put(1, "swa");
		hp.put(2, 1000);
		hp.put(3, "ahaan");
		hp.put(4, 700);
		hp.put(5, "jyothi");
		System.out.println("Hash Map: "+hp);
		// to count the number of key-value (size) mappings in a map
		System.out.println(" count the number of key-value (size) mappings in a map: "+hp.size());
	}

}
