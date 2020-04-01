package Controller;

import DAO.BankDAOImplementation;
import User.User;

//controller incharge of bank
public class BankController {
	
	private BankDAOImplementation refDAOImplementation = new BankDAOImplementation();
	
	//redirecting to appropriate bank functions chosen by user
	
	public void bankLogic(User refUser, int option) {
		switch (option) {
		case 1:
			//to check balance
			refDAOImplementation.checkBalance(refUser);
			break;
		case 2:
			//to deposit
			refDAOImplementation.deposit(refUser);

			break;
		case 3:
			refDAOImplementation.withdraw(refUser);
			break;
		default:
			//if options not 1 to 4, throw an error
			System.out.println("Option not available");
			
		}
		
	}
		
}
