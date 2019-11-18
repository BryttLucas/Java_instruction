
public class Person {

	public Person() {
   // display a Welcome message
      System.out.println("Welcome to Person Manger!\n\n");
      System.out.println(); 
	}
          
    private String first;
  	private String last;
  	private String customerNumber;
 
  	public Person(String first, String last, String customer number) {
  		this.String First = first;
  		this.String Last = last;
  		this.String CustomerNumber = customerNumber;
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



	public String getCustomer() {
		return customer;
	}



	public void setCustomer(String customer) {
		this.customer = customer;
	
	}
	@Override
	public String toString() {
		return "Person [first=" + first + ", last=" + last + ", customer=" + customer + "]";
	}
  
  	}
  	
	
