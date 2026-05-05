package com.exception;

public class CheckingAccount {
	int acno;
	double balance;
	String cname;
	public CheckingAccount(int acno, double balance, String cname) {
		this.acno = acno;
		this.balance = balance;
		this.cname = cname;
		System.out.println("Hello "+cname+", Your Account Number "+acno+" Is Opened With "+balance);
	}
	void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
	void withdraw(double amount) throws InsufficientFund{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}
		else {
			throw new InsufficientFund(amount-this.balance);
		}
	}
	void checkbalance()
	{
		System.out.println("Current Balance Is : "+this.balance);
	}
}
