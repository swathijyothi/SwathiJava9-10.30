package com.collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s= new Stack();
		s.push(10);
		s.push(19.433);
		s.push('d');
		s.push("swa");
		s.push(true);
		s.push(10);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);
	}

}
