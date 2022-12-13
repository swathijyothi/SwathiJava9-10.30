package com.module2;

public class CompareString {
	public static void main(String[] args) {
		String s1="tops technology";
		String s2="tops technology";
		String s3="TOPS TECHNOLOGY";
		String s4=new String(s2);
		 int b=s1.compareTo(s2);
		 int b1=s1.compareTo(s3);
		 System.out.println("comparing s1 and s2");
		 if(b==0) {
			 System.out.println("equal");
		 }else {
			 System.out.println("not equal");
		 }
		 System.out.println("comparing s1,s3");
		 if(b1==0) {
			 System.out.println("equal");
		 }else {
			 System.out.println("not equal");
		 }
		 System.out.println("comparing by ignoring case");
		 int b3=s1.compareToIgnoreCase(s3);
		 if(b3==0) {
			 System.out.println("equal");
		 }else {
			 System.out.println("not equal");
		 }
		 System.out.println("----------------------------------------------------------------------------------------------------------");
		 System.out.println("comparing s1,s2 using equal method:"+s1.equals(s2));
		 System.out.println("----------------------------------------------------------------------------------------------------------");
		 System.out.println("compare using == operator");
		 System.out.println(s1==s4);
	}

}
