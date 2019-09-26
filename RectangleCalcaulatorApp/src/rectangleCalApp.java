import java.util.Scanner;

public class rectangleCalApp {

	public static void main(String[] args) {
	    String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    System.out.println("Welcome to the Area and Perimter Calculator");
	    int length,width,area,perimeter;
	    System.out.print("Enter length");
	    length = sc.nextInt();
	    System.out.print("Enter width");
	    width = sc.nextInt();
	    area = length * width; 
	    perimeter = 2 *length + 2 * width;
		 
		 System.out.print("Area =" +area);
		 System.out.print("\n Perimerter = " +perimeter);
     
         System.out.print("Continue? (y/n): ");
         choice = sc.next();
         System.out.println();
    }    
  }
}

	
	


