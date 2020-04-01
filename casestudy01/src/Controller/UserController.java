package Controller;

import Service.UserServiceImplementation;
import User.User;

//direct services chosen by the user
public class UserController {
	private static UserServiceImplementation refUserService = new UserServiceImplementation();
	private static User refUser = new User();
	
	public void myLogic(int option) {
		switch (option) {
		case 1:
			refUserService.userRegister(refUser);
			break;
		case 2:
			refUserService.userLogin(refUser);
			break;
		case 3:
			refUserService.userForgetPassword(refUser);
			break;
		case 4:		
			System.out.println("Logged out successfully!");
			break;
		default:
			System.out.println("Option not available");
			
		}
	}

}
