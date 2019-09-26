package studentRegisApp;

import java.util.Scanner;

public class project {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Student Registration From\n");
	   
	    System.out.print("Enter First Name:");
	    String fname = input.next();
	 
        System.out.print("Enter Last Name");
	    String lname = input.next();
	        
	    System.out.print("Enter Year of Birth");
	    String ybirth = input.next();
	  
	  System.out.println("Welcome " +fname+" "+lname+ "\n Your password is "+lname+ "*" +ybirth);
	
	

	}

}
