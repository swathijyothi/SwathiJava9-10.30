package com.errorhandling;

import java.util.Scanner;

public class CheckBalance {
	long accountno;
	double balance=0;
	
	public void deposit(double d) {
		this.balance=d+this.balance;
	}
	
	public void balanceCheck() 
	{
		System.out.println("Current balane="+this.balance);
	}
	public void withdrawel(double w) throws insufficientBalance{
		if(w<this.balance) {
			this.balance=this.balance-w;
			System.out.println("withdraw successfull");
			
		}
		else {
			double need =w-this.balance;
			throw new insufficientBalance(need);
		}
			
	}
	
	public static void main(String[] args) {
		System.out.println("****************** WELCOME TO SBI********************");
		Scanner sc= new Scanner(System.in);
		CheckBalance c=new CheckBalance();
		System.out.println("Enter Account Number");
		long a=sc.nextLong();
		System.out.println("Enter the Deposit Amount");
		double d=sc.nextDouble();
		c.deposit(d);
		c.balanceCheck();
		System.out.println("Enter the withdrawel Amount");
		double w=sc.nextDouble();
		try {
			c.withdrawel(w);
		} catch (insufficientBalance e) {
			
		System.out.println("infufficient balance.\n"+e.getAmount()+"more required");
		}
		
		c.balanceCheck();
	}

}
