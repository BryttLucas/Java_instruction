import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Grade Converter!\n");
		Scanner sc = new Scanner( System.in);
		
		String choice = ("y");
		while (choice.equalsIgnoreCase("y"))  {
		
			  
		System.out.println("Enter a Number:");
		       
		       int x;
		        x = sc.nextInt();

		        if (x <= 100 && x >= 90) {
		            System.out.println("Letter grade: A");
		        }

		        if(x <= 89 && x >= 80) {
		            System.out.println("Letter grade: B");
		        }

		        if(x <= 79 && x >= 70) {
		            System.out.println("Letter grade: C");
		        }

		        if(x <=69 && x >=60) {
		            System.out.println("Letter grade: D");
		        }

		        if(x <=50 && x >=0) {
		            System.out.println("Letter grade: F");
		        }
		        System.out.print("Continue? (y/n): ");
		        choice = sc.next();
		        System.out.println();
		       
        }
		
	}
}
