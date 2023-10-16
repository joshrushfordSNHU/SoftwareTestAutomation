import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest extends ContactService {

	public ContactServiceTest(String firstName, String lastName, int phoneNumber, String address) {
		super(firstName, lastName, phoneNumber, address);
	}

	@Test
	void testAddContact() {
		addContact("Joe", "Yo", 888888888, "98 Hello St", "56jh12");
		if (uniqueId.get(0) == "56jh12") {
			System.out.println("Added successfully");
		} else {
			System.out.println("Added unsuccessfully");
		}
	}
}
