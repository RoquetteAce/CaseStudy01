package DAO;

import User.User;

//creates an interface for Bank

public interface BankDAOInterface {
	
	void checkBalance(User refUser);
	void deposit(User refUser);
	void withdraw(User refUser);
	
}
