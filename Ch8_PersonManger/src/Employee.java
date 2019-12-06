
public class Employee {
		
		private String first;
	  	private String last;
	  	private long ssn;
	 
	  	public void Person(String first, String last, long ssn) {
	  		this.first = first;
	  		this.last = last;
	  		this.ssn = ssn; 
	}

		public String getFirst() {
			return first;
		}

		public void setFirst(String first) {
			this.first = first;
		}

		public String getLast() {
			return last;
		}

		public void setLast(String last) {
			this.last = last;
		}

		public long getSsn() {
			return ssn;
		}

		public void setSsn(long ssn) {
			this.ssn = ssn;
		}

		@Override
		public String toString() {
			return "Employee [first=" + first + ", last=" + last + ", ssn=" + ssn + "]";
		}

}
