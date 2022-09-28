package com.module2;

public class PrintNumber {
public void	printn(int n)
{
	System.out.println("print integer:"+n);
}
public void printn(float f) 
{
	System.out.println("print float number:"+f);
}
public void printn(double d) {
	System.out.println("print double number"+d);
	
}
public void printn(char c) {
	System.out.println("print character:"+c);
}
	public static void main(String[] args) {
		PrintNumber p=new PrintNumber();
		p.printn(10);
		p.printn(12.8f);
		p.printn(12.889999);
		p.printn('a');
	}

}
