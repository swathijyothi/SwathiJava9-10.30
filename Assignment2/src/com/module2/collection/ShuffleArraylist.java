package com.module2.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArraylist {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ArrayList a=ar;
	ar.add("swa");
	ar.add(10);
	ar.add(98.08);
	ar.add('d');
	ar.add(null);
	ar.add(true);
	ar.add(12);
	System.out.println("before shuffling:"+ar);
	Collections.shuffle(ar);
	System.out.println("after shuffling:" +ar);
}
}
