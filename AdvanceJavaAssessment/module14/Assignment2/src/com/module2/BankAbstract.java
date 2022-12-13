package com.module2;
abstract class Bank{
	int amount;
	abstract int getBalance();
}
class BankA extends Bank{

	@Override
	int getBalance() {
		 amount =100;
		
		return amount;
	}
	
}
class BankB extends Bank{

	@Override
	int getBalance() {
		 amount=150;
		return amount;
	}
	
}
class BankC extends Bank{

	@Override
	int getBalance() {
	 amount=200;
		return amount;
	}
	
}
public class BankAbstract {
public static void main(String[] arg) {
	int amount=0;
	BankA a=new BankA();
	BankB b=new BankB();
	BankC c=new BankC();
	amount=a.getBalance();
	System.out.println("Amount Deposited in Bank A is "+amount+"$");
	System.out.println("Amount Deposited in Bank B is "+b.getBalance()+"$");
	System.out.println("Amount Deposited in Bank B is "+c.getBalance()+"$");
}
}
