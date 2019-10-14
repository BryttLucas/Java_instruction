public class StudentScoreApp {

	public class Student {
	    private int id = -1;
	    private String firstName = "";
	    private String lastName = "";
	    private int score = -1;
	 
	    public Student(int id, String fName, String lName, int score) {
	        this.id = id;
	        this.firstName = fName;
	        this.lastName = lName;
	        this.score = -1;
	          
	    }
	 
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		@Override
	    public String toString() {
	        return "Student : " + id + " - " + firstName + " - " + lastName
	        + " - " + score + "n";
   }
 }
} 
