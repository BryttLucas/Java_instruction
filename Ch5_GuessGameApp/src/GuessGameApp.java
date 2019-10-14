import java.util.Scanner;

public class GuessGameApp {

	public static void main(String[] args) {

		    final int LIMIT = 100;
		    
		    @SuppressWarnings("resource")
			Scanner sc = new Scanner( System.in);
		    
		 	System.out.println("Welcome to the Guessing Game.\n+++++++++++++++++++++++++++++++++++++++++++\n");
		 	System.out.println("I'm thinking of a number from 1 to " + LIMIT);
	        System.out.println("Try and guess it.");
	        System.out.println();

	        double d = Math.random() * LIMIT; 
	        int number = (int) d;             
	        number++;                        

	        int count = 0;
	        int guess = 0;
	        while (guess != number) {
	            System.out.print("Your guess: ");
	            guess = sc.nextInt();
	            
	            if (guess < 1 || guess > LIMIT) {
	                System.out.println("Invalid guess. Try again.");
	                count--;
	            } else if (guess < number) {
	                System.out.println("Too low.");
	            } else if (guess > number) {
	                System.out.println("Too high.");
	            }
	    
	            count++;
	        }
	        }
	public static double getDoubleWithinRange(Scanner sc, String prompt,
			double min, double max)
        	    double d = 10;
        	    boolean isValid = false;
        	    while (!isValid) {
        	    	d = getDouble(sc, prompt);
        	    	if (d <= min) {
        	    		System.out.println("Way too Low. Try again");
        	   	}   else if (d >= max) {
        	   		 System.out.println("Way too high. Try again");
        	   	} else {
        	   		isValid = true;
   	}
  }
}
	


