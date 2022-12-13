package com.module2.collection;

import java.util.ArrayList;
import java.util.Comparator;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(19);
		al.add(21);
		al.add(4);
		al.add(78);
		al.add(5);
		System.out.println("Unsort ArrayList");
		System.out.println(al);
		System.out.println("Sort ArrayList");
		al.sort(Comparator.naturalOrder());
		System.out.println(al);
		ArrayList<String>als=new ArrayList<String>();
		als.add("swa");
		als.add("ahaan");
		als.add("jyothi");
		als.add("sujith");
		als.add("lal");
		System.out.println("unsorted list: "+als);
		als.sort(Comparator.reverseOrder());
		System.out.println("sorted list :" +als);
	}

}
