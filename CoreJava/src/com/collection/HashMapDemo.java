package com.collection;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put(1, "swa");
	hm.put(2, "ahaan");
	hm.put(3, "jyothi");
	hm.put(4, "babitha");
	hm.put(4, "swathi");
	System.out.println(hm);
	System.out.println(hm.get(4));
}
}
