import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest extends Contact {

	@Test
	void testUniqueId() {
		assert this.uniqueId.get(1).length() <= 10;
		assert this.uniqueId.get(1).length() > 0;
	}
	
	void testFirstName() {
		assert this.firstName.length() <= 10;
		assert this.firstName.length() > 0;
	}
	
	void testLastName() {
		assert this.lastName.length() <= 10;
		assert this.lastName.length() > 0;
	}
	
	void testPhoneNumber() {
		assert Math.abs(this.phoneNumber) <= 10;
		assert Math.abs(this.phoneNumber) > 0;
	}
	
	void testAddress() {
		assert this.address.length() <= 30;
		assert this.address.length() > 0;
	}

}
