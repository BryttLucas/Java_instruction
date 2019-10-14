

public class ContactListApp {
	
		
  public static void main(String [] args) {
	  System.out.println(" Welcome to the Contact List!");
	 
	   
	  String firstName = Console.getString("Enter first name: ");
	  String lastName = Console.getString("Enter last name: ");
	  String email = Console.getString("Enter an email: ");
	  String phone = Console.getString("Enter phone number: ");
	
	  Contact newContact = new Contact(firstName, lastName, email,phone);
	
	   System.out.println("-------------------------------------");
	   System.out.println("----Current Contact------------------");
	   System.out.println("-------------------------------------");
	   System.out.println(newContact.displayContact());
	
	
	   
	  

	
   }
  }

  

