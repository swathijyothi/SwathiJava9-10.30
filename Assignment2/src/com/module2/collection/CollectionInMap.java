package com.module2.collection;

import java.util.HashMap;

public class CollectionInMap {
	public static void main(String[] args) {
		HashMap hm=new HashMap<>();
		hm.put(1, "value1");
		hm.put(2, "value2");
		hm.put(3, "value3");
		System.out.println("collection view:"+hm.values());
	}

}
