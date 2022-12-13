package com.module2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapArrayList {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		ArrayList a2=new ArrayList<>();
		a2.add(10);
		a2.add(3);
		a2.add(43);
		a2.add(1);
		a2.add(21);
		System.out.println("ArrayList 1:"+a1);
		System.out.println("ArrayList 2 :"+a2);
		ArrayList temp=new ArrayList<>();
		temp=(ArrayList) a1.clone();
		a1=a2;
		a2=temp;
		System.out.println("ArrayList 1:"+a1);
		System.out.println("ArrayList 2:"+a2);
	}

}
