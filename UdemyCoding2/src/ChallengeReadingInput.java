import java.util.Scanner;

public class ChallengeReadingInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int counter = 0;
		int sum =0;
		
//		while(true) {
		while(counter > 10) {
			int order = counter + 1;
			System.out.println("You need to enter #" + order + ":" );
			
			boolean isAnInt = sc.hasNextInt();
			
			   if(isAnInt) {
				   int number = sc.nextInt();
				   counter++;
				   sum += number;
//				   if(counter == 10) {
//				      break;
//				   }
			   }else {
				   System.out.println("Invalid number");
			   }
			   sc.nextLine();
		}
		System.out.println("Sum = "+ sum);
        sc.close();
      
    }
}