import java.util.Date;

public class Actor {

	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private Date birthDate;
	
	public Actor() {
		id = 0;
		firstName = "";
		lastName  = "";
		gender    = "";
		birthDate = 0;
			
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthdate() {
		return birthDate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthDate = birthdate;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", firstname=" + firstName + ", lastname=" + lastName + ", gender=" + gender
				+ ", birthdate=" + birthDate + "]";
	}

}

