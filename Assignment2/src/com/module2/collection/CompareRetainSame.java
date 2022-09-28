package com.module2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareRetainSame {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>(Arrays.asList(1,"SWA","WAS","12",12,'A'));
		ArrayList a2=new ArrayList<>(Arrays.asList(123,"SWA","WAS","12",124,'c'));
		//a1.removeAll(a2);
		a1.retainAll(a2);
		System.out.println(a1);
	}

}
