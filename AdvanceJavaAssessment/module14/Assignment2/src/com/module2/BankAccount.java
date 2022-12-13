package com.module2;

import java.util.Scanner;

public class BankAccount {
	double balance=0;
	
	public void deposit(double a) {
		this.balance=this.balance+a;
		
	}
	public void CurrentBalance() {
		System.out.println("current balance:"+this.balance);
	}
	void checkBalance(double w) throws InsufficientBalance {
		if(w<this.balance) {
			this.balance=this.balance-w;
			System.out.println("Withdraw successfull");
		}else {
			double need=w-this.balance;
			throw new InsufficientBalance(need);
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("------------WELCOME TO SBI-----------------");
		long accountno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account NO:");
		accountno=sc.nextLong();
		System.out.println("Enter the Deposit amount:");
		double amount=sc.nextDouble();
		BankAccount b=new BankAccount();
		b.deposit(amount);
		b.CurrentBalance();
		System.out.println("Enter the Withdraw Amount:");
		double w=sc.nextDouble();
		try {
			b.checkBalance(w);
		} catch (InsufficientBalance e) {
			
			System.out.println("Insufficient Balance "+e.getAmount()+" more required");
		}
		
		b.CurrentBalance();
	}

}
