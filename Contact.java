import java.util.ArrayList;

public class Contact {

	ArrayList<String> uniqueId = new ArrayList<String>();
	String firstName;
	String lastName;
	int phoneNumber;
	String address;
	
	public Contact() {
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId.add(uniqueId);
	}
		
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if (firstName.length() > 10) {
			this.firstName = "Too many characters";
		} else if (firstName.length() < 1) {
			this.firstName = "Field cannot be null";
		} else {
			this.firstName = firstName;
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if (lastName.length() > 10) {
			this.lastName = "Too many characters";
		} else if (lastName.length() < 1) {
			this.lastName = "Field cannot be null";
		} else {
			this.lastName = lastName;
		}
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		if (Math.abs(phoneNumber) != 10) {
			this.phoneNumber = 0;
		} else {
			this.phoneNumber = phoneNumber;
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if (address.length() > 30) {
			this.address = "Too many characters";
		} else if (address.length() < 1) {
			this.address = "Field cannot be null";
		} else {
			this.address = address;
		}
	}
	
}
