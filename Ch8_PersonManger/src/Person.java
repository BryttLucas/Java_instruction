
public class Person {

	public Person() {
		// display a Welcome message
		System.out.println("Welcome to Person Manger!\n\n");
		System.out.println();
	}

	private String firstName;
	private String lastName;
	private int customerNumber;

	public Person(String firstName, String lastName, int customerNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerNumber = customerNumber;
	}

	public String getFirst() {
		return firstName;
	}

	public void setFirst(String firstName) {
		this.firstName = firstName;
	}

	public String getLast() {
		return lastName;
	}

	public void setLast(String lastName) {
		this.lastName = lastName;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", customerNumber=" + customerNumber + "]";
	}
}
	