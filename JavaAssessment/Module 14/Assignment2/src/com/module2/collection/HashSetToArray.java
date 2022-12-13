package com.module2.collection;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {
	public static void main(String[] args) {
		HashSet hs=new HashSet<>(Arrays.asList("to","swa","ahaan","aq","jyothi"));
		System.out.println("Hash_Set:"+hs);
		String [] array=new String [hs.size()];
		hs.toArray(array);
		System.out.println("AfterConverting to array:");
		for(String a:array) {
			System.out.println(a);
		}
	}

}
