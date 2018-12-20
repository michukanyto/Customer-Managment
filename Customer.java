package finalExam;

public class Customer {
	int userId;
	String firstName;
	String lastName;
	String email;
	String postalAddress;
	String phoneNumber;	
	
	public Customer(int id,String fName,String lName,String eMail,String postalCode,String telNumber) {
		userId = id;
		firstName = fName;
		lastName = lName;
		email = eMail;
		postalAddress = postalCode;
		phoneNumber = telNumber;
		
	}
	
	public int getUserId() {
		return userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPostaAddress() {
		return postalAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

}
