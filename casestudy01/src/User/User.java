package User;

//pojo of User

public class User {
	private String email = "xyz@gmail.com";
	private String password = "";
	private String secKey;
	private int amount;
	
	//setters and getters for User
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getSecKey() {
		return secKey;
	}
	
	public void setSecKey(String secKey) {
		this.secKey = secKey;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
