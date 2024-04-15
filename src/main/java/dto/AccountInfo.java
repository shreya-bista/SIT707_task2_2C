package dto;

public class AccountInfo {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String password;
	

	private AccountInfo() {}

	public AccountInfo(String firstName, String lastName, String phoneNumber, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}



	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}
	
	
	
}
