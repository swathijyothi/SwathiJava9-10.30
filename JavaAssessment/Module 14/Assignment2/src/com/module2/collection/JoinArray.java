package com.module2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class JoinArray {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>(Arrays.asList(1,2,43,54,43));
		ArrayList a2=new ArrayList<>(Arrays.asList(21,32,43,3,2));
		a1.addAll(a2);
		System.out.println("After Joining: "+a1);
	}

}
