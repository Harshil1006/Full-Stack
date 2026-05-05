package com.exception;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		CheckingAccount c=new CheckingAccount(101,1000,"Harshil Suthar");
		Scanner sc=new Scanner(System.in);
		double ammount;
		while(true)
		{
			System.out.println("************************************************");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("************************************************");
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			System.out.println("************************************************");
			
			if(choice==1)
			{
				System.out.println("Enter Deposit Amount : ");
				ammount=sc.nextDouble();
				c.deposit(ammount);
			}
			else if(choice==2)
			{
				System.out.println("Enter Withdrawal Amopunt");
				ammount=sc.nextDouble();
				try {
					c.withdraw(ammount);
				}catch(InsufficientFund e) {
					System.out.println("Sorry You Need Another "+e.getAmmount()+" Rs. ");
				}
			}
			else if(choice==3)
			{
				c.checkbalance();
			}
			else if(choice==4)
			{
				System.out.println("Thank You For Using Our Sewrvices");
				System.out.println("********************************************");
				break;
			}
			else
			{
				System.out.println("Invalid Choice. Please Try Again");
			}
			System.out.println("************************************************");
		}
	}
}
