package com.errorhandling;

public class insufficientBalance extends Exception {
	double amount;

	public insufficientBalance(double amount) {
	
		this.amount = amount;
	}
	
public double getAmount() {
	return this.amount;
	
}
}
