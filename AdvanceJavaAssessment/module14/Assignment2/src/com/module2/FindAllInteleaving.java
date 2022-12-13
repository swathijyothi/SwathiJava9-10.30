package com.module2;

public class FindAllInteleaving {
	static void printInterleaving(String s1,int i,String s2,int j,String s3) {
		
		if(i==s1.length()&&j==s2.length())
		{
			System.out.println(s3);
		}
		if(i<s1.length()) {
			printInterleaving(s1,i+1,s2,j,s3+s1.charAt(i));
		}
		if(j<s2.length()) {
			printInterleaving(s1,i,s2,j+1,s3+s2.charAt(j));
		}
	}
	
	public static void main(String[] args) {
		String s1="WX";
		String s2="YZ";
		System.out.println("Given String:"+s1+" "+s2);
		System.out.println("Interleaving String");
		String s3 =new String();
		printInterleaving(s1,0,s2,0,s3); 
			
	}

}
