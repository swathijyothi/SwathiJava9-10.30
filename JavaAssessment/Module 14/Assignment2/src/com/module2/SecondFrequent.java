package com.module2;

public class SecondFrequent {
public static void main(String[] args) {
	String s1="malayalam";
	int n=s1.length();
	char s='0';
	int i,j=1,count=0,temp1=0,temp2=0,max=0,sec_max=0;
	char [] c=s1.toCharArray();
	for(i=0;i<n;i++)
	{
		for(j=1;j<n;j++) {
		if(c[i]==c[j]) {
		count++;
			
			
		}
		}if(count>max) {
			temp1=max;
			max=count;
			count=0;
		}
		else if(count<max&&count>sec_max) {
			temp2=sec_max;
			sec_max=count;
			count=0;
			
		}
				else {
			count=0;
		}
	}System.out.println("secont most frequent character is :"+s);
}
}
