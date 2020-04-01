package Service;

import User.User;

//creates an interface for User

public interface UserServiceInterface {
	void userRegister(User refUser);
	void userLogin(User refUser);
	void userForgetPassword(User refUser);
	void useBankApplication(User ref);
}
