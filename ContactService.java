import java.util.Scanner;

public class ContactService extends Contact {
	
	Scanner scnr = new Scanner(System.in);

	public ContactService(String firstName, String lastName, int phoneNumber, String address) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setAddress(address);
	}
	
	public void addContact(String firstName, String lastName, int phoneNumber, String address, String uniqueId) {
		System.out.println("Enter First Name:");
		scnr.nextLine();
		if (this.uniqueId.contains(uniqueId)) {
			System.out.println("ID not unique");
		} else {
			setUniqueId(uniqueId);
		}
		System.out.println("Enter First Name:");
		scnr.nextLine();
		setFirstName(firstName);
		System.out.println("Enter Last Name:");
		scnr.nextLine();
		setLastName(lastName);
		System.out.println("Enter Phone Number:");
		scnr.nextLine();
		setPhoneNumber(phoneNumber);
		System.out.println("Enter Address:");
		scnr.nextLine();
		setAddress(address);
	}
	
	public void deleteContact(String uniqueId) {
		System.out.println("Enter the Unique ID of the contact you wish to delete:");
		scnr.nextLine();
		for (int i = 0; i <= this.uniqueId.size(); i++) {
			if (this.uniqueId.get(i) == uniqueId) {
				this.uniqueId.remove(i);
				System.out.println("Contact " + uniqueId + " has been removed.");
			}
		}
	}
	
	public void editContact(String firstName, String lastName, int phoneNumber, String address, String uniqueId) {
		System.out.println("Enter the Unique ID of the contact you wish to edit:");
		scnr.nextLine();
		for (int i = 0; i <= this.uniqueId.size(); i++) {
			if (this.uniqueId.get(i) == uniqueId) {
				System.out.println("Contact found.");
				System.out.println("Enter new first name:");
				scnr.nextLine();
				System.out.println("Enter new last name:");
				scnr.nextLine();
				System.out.println("Enter new number:");
				scnr.nextLine();
				System.out.println("Enter new address:");
				scnr.nextLine();
			}
		}
	}
}
