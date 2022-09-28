package com.module2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class IncreaseSizeOfArrayList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>(Arrays.asList(1,"swa",2,"ahaan",9));
	System.out.println("size:"+al.size());
	al.ensureCapacity(6);
	al.add(10);
	al.add(2);
	System.out.println("after increasing size:"+al);
	System.out.println("size:"+al.size());
	// replace the second element of an Array List with the specified element.
	al.set(2, "element");
	System.out.println("replace the second element of an Array List with the specified element \n"+al);
	//program to print all the elements of an Array List using the position of the elements. 
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}

}
}