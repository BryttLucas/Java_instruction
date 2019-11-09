package business;

public class Users {
    
	private String lastName;
	private String firstName;
	private String email;
	private String gender;
	
	public Users(String lastName, String firstName, String email, String gender) {
	this.lastName = lastName;
	this.firstName = firstName;
	this.email = email;
	this.gender = gender;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Users [lastName=" + lastName + ", firstName=" + firstName + ", email=" + email + ", gender=" + gender
				+ "]";
	}
	      
	      
}
