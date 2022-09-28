package com.module2.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CopyArray {
	public static void main(String[] args) {
		int i;
		ArrayList ar=new ArrayList();
		ArrayList a=ar;
		ar.add("swa");
		ar.add(10);
		ar.add(98.08);
		ar.add('d');
		ar.add(null);
		ar.add(true);
		ar.add(12);
		Iterator it=a.iterator();
	
		while(it.hasNext()) {
		System.out.println(it.next());
		
		}
		System.out.println("original list: "+ar);
		System.out.println("copied list: "+a);
		//2)method
		ArrayList<Integer>ai=new ArrayList<Integer>();
		ArrayList<Integer>c1=new ArrayList<Integer>();
		ai.add(10);
		ai.add(21);
		ai.add(1);
		ai.add(90);
		for(Integer v:ai) {
			c1.add(v);
		}
		System.out.println("original list: "+ai);
		System.out.println("copied list: "+c1);
		//3)method
		ArrayList<Integer>a2=new ArrayList<Integer>();
		ArrayList<Integer>c2=new ArrayList<Integer>();
		a2.add(10);
		a2.add(21);
		a2.add(1);
		a2.add(90);
		c2=(ArrayList) a2.clone();
		System.out.println("original list: "+a2);
		System.out.println("copied list: "+c2);
	}

}
