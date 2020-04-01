/*
 * T2S3
 * Case Study 1
 * Squad members: Sharon, John, Hassan, Ain
 */

package Demo;

import java.util.*;

import Controller.UserController;

//menu
class startOfDemo {
	//wanted to test if we can continue on with the program once the exception is caught
	private static UserController refUserController;
	
	void toRun() {
		
		int option = 0;
		Scanner input = new Scanner(System.in);
		refUserController = new UserController();
		
		while (option != 4) {
			System.out.println("User Home page: \n1: Register\n2: Login\n3: Forget Password\n4: Logout ");
			System.out.print("Enter your choice: ");
			option = input.nextInt();
			refUserController.myLogic(option);
			
		}
		
	}
	
}

//start of program
public class ApplicationDemo {
	
	static startOfDemo t = new startOfDemo();

	public static void main(String[] args) {
		
		try {
			t.toRun();
		}
		
		
		catch (InputMismatchException e) {
			System.out.println("Invalid, only integers 1 to 4 allowed.");
			t.toRun();
		}

	}

}
