package com.module2;

public class InsufficientBalance extends Exception {
	double amount;

	public InsufficientBalance(double amount) {
		
		this.amount = amount;
	}
	public double getAmount() {
		return this.amount;
		
	}
}
