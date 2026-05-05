package com.exception;

public class InsufficientFund extends Exception {
	
	double amount;
	public InsufficientFund(double amount) {
		this.amount=amount;
	}
	public double getAmmount() {
		return this.amount;
	}
}
