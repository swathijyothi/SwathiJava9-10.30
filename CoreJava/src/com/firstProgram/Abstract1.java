package com.firstProgram;

abstract class rbi{
	abstract float interestRate();
	
}
class sbi extends rbi{

	@Override
float interestRate() {
	float ir=10;
		return ir;
	}
	
}
class hdfc extends rbi{

	@Override
	float interestRate() {
		float ir=(float) 8.9;
		return ir;
		
		
	}
	
}
class kotak extends rbi{

	@Override
	float interestRate() {
		float ir=(float)7.9;
		return ir;
		
		
	}
	
}
public class Abstract1 {
public static void main(String[] args) {
	sbi s= new sbi();
	hdfc h= new hdfc();
	kotak k = new kotak();
	System.out.println("sbi interest rate="+s.interestRate());
	System.out.println("hdfc interest rate="+h.interestRate());
	System.out.println("kotak interest rate="+k.interestRate());
	
}
}
