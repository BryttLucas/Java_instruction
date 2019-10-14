import java.util.Scanner;

class ChangeCalApp {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Change Calcultor!\n");
		
	//	String choice  = "y";
	//	while (choice.equalsIgnoreCase("Y"));
		
		System.out.println("Enter number of cents (0-99):");
		double cent = sc.nextInt();
		
		double quarter = 25;
		double dime = 10;
		double nickel = 5;
		double penny = 1;
		
		double totalQuarter = (cent/quarter);
		cent %= quarter;
		double totalDime = (cent / dime);
		cent %= dime;
		double totalNickel = (cent / nickel);
		cent %= nickel;
		double totalPenny = (cent / cent);
		cent %= penny;
		
		
		System.out.println(totalQuarter);
		System.out.println(totalDime);
		System.out.println(totalNickel);
		System.out.println(totalPenny);
		
	//	System.out.println("Contine? (y/n");
	//	choice = sc.next();
	//	System.out.println();
	
    //  System.out.print("Goodbye");
}
}