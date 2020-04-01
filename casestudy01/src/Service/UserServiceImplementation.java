package Service;

import User.User;

import java.util.*;

import Controller.BankController;

//implementation of User interface
public class UserServiceImplementation implements UserServiceInterface {
	
	private Scanner input = new Scanner(System.in);
	private BankController refBankController = new BankController();
	private Password refPassword = new Password();
	
	//To register user account
	@Override
	public void userRegister(User refUser) {
		System.out.println("Enter your email address: ");
		String email = input.nextLine();
		
		while (email.equals(refUser.getEmail())){
			System.out.println("Email already exists");
			System.out.println("Enter your email address: ");
			email = input.nextLine();
		}
		
			refUser.setEmail(email);
			refPassword.userPassword(refUser);
			System.out.println("Enter your favourite colour: ");
			String favColour = input.nextLine();
			refUser.setSecKey(favColour);
			System.out.println("Registration successful!");
		
	}
	
	//to validate login credential
	@Override
	public void userLogin(User refUser) {
		System.out.println("Enter your email address: ");
		String email = input.next();
		System.out.println("Enter your password: ");
		String password = input.next();
		
		if (refUser.getEmail().equals(email) && refUser.getPassword().equals(password)) {
			System.out.println("Login Successful!");
		}
		

		while (!refUser.getEmail().equals(email) || !refUser.getPassword().equals(password)) {

			System.out.println("Wrong info! Try again!");
			System.out.println("Enter your email address: ");
			email = input.nextLine();
			System.out.println("Enter your password: ");
			password = input.nextLine();
		}
		
		//loading of BankPage
		useBankApplication(refUser);
		
	}
	
	//Reset password for user
	@Override
	public void userForgetPassword(User refUser) {
		System.out.println("Enter your email address: ");
		String email = input.next();
		System.out.println("Enter your security key: ");
		String key = input.next();

		while (!refUser.getEmail().equals(email) || !refUser.getSecKey().equals(key)) {
			System.out.println("Wrong info! Try again!");
			System.out.println("Enter your email address: ");
			email = input.nextLine();
			System.out.println("Enter your security key: ");
			key = input.nextLine();
		}
		
		if (refUser.getEmail().equals(email) && refUser.getSecKey().equals(key)) {
			
			refPassword.userPassword(refUser);
			System.out.println("Enter your new favourite colour: ");
			String favColour = input.next();
			refUser.setSecKey(favColour);
			System.out.println("Your password has been reset successfully!");
		} 
		
	}

	//run bank service
	@Override
	public void useBankApplication(User refUser) {
		String continueYN = "Y";
		
		while (!continueYN.equalsIgnoreCase("N")) {
			System.out.println("Type 1 : Check Available Bank Balance \nType 2 : Deposit Amount \nType 3 : Withdraw Amount");
			System.out.print("Enter your choice: ");
			int option = input.nextInt();
			refBankController.bankLogic(refUser,option);
			System.out.print("Do you wish to continue? Y/N");
			continueYN = input.next();
		}
		
	}

}
