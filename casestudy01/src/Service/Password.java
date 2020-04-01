package Service;

import java.util.Scanner;

import User.User;

public class Password {
	//to compare the passwords, for resetting and creating new accounts
	
		Scanner input = new Scanner(System.in);
		
		void userPassword(User refUser) {
			System.out.println("Enter your new password: ");
			String password = input.next();
			System.out.println("Re-type your password: ");
			String password2 = input.next();
			while (!password.equals(password2)) {

				System.out.println("Password does not match! ");
				System.out.println("Enter your new password: ");
				password = input.next();
				System.out.println("Re-type your password: ");
				password2 = input.next();
			} 

			refUser.setPassword(password);
		}
}
