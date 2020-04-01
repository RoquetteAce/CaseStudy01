package DAO;

import java.util.Scanner;

import User.User;

//to implement the bank interface

public class BankDAOImplementation implements BankDAOInterface {
	Scanner input = new Scanner(System.in);
	static int amount = 0;
	
	//checking the balance of User account
	@Override
	public void checkBalance(User refUser) {
		
		System.out.println("Current Balance: $" + refUser.getAmount());
		
	}
	
	/*
	 * Depositing amount specified by user
	 * Take in amount from user, check if amount is lesser than or equals to 0 
	 * else deposit
	 */
	@Override
	public void deposit(User refUser) {
		
		System.out.println("Enter Amount: ");
		amount = input.nextInt();
		
		if (amount <= 0) {
			System.out.println("Amount cannot be 0 or negative");
		}else {
			refUser.setAmount(refUser.getAmount() + amount);
			System.out.println("Deposit Successful!");
		}
		
	}

	/*
	 * Withdrawing amount specified by user
	 * Take in amount from user, check if amount is lesser than or equals to 0  or amount is more than balance
	 * else withdraw
	 */
	@Override
	public void withdraw(User refUser) {
		System.out.println("Enter Amount: ");
		amount = input.nextInt();
		if (refUser.getAmount() < amount) {
			System.out.println("Insufficient Amount!");
		}else if (amount <= 0) {
			System.out.println("Invalid Amount!");
		}else {
			refUser.setAmount(refUser.getAmount() - amount);
			System.out.println("Withdraw Successful!");
		}
		
	}

}
