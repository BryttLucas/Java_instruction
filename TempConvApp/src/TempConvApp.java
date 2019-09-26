import java.util.Scanner;

public class TempConvApp {

	private static Scanner sc;

	public static void main(String[] args) {
		
		String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	       
	        	float temperature;
		    sc = new Scanner(System.in);
		 
		    System.out.print("Enter temperature in Fahrenheit");
		    temperature = sc.nextInt();
		 
		    temperature = ((temperature - 32)*5)/9;
		 
		    System.out.println("temperature in Celsius = " + temperature);
		    
		    System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
	} 
  }
