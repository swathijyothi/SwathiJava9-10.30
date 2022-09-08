package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(19.89);
		al.add('s');
		al.add("ahaan");
		al.add(null);
		al.add(true);
		al.add("ahaan jyothi");
		System.out.println(al);
		System.out.println("array size:"+al.size());
		System.out.println("index of ahaan:"+al.indexOf("ahaan"));
		System.out.println("after removing null");
		System.out.println(al.remove(4));
		System.out.println("after adding new element");
		System.out.println(al.set(5, "new element"));
		System.out.println(al.isEmpty());
		//System.out.println(al.removeAll(al));
		//System.out.println(al.isEmpty());
		
		System.out.println("------------iterator------------");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-----------List Iterator--------------");
		ListIterator lis=al.listIterator();
		while(lis.hasNext()) 
		{
			System.out.println(lis.next());
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Reverse Order");
		while(lis.hasPrevious()) {
			System.out.println(lis.previous());
		}
	}

}
