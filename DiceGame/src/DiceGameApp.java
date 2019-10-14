import java.util.Scanner;

public class DiceGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Game!");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner( System.in);
		 String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
		
		int dice1=(int)(Math.random()*6+1);
	    int dice2=(int)(Math.random()*6+1);
	    int sum= dice1 + dice2;
	   
	   System.out.println("Dice 1:"+ dice1);
	   System.out.println("Dice 2:" + dice2);
	   System.out.println("Roll: total = " + sum); 
	   {
		 if (sum==2)
         System.out.print("Snake eyes\n");
	     if (sum==12) 
         System.out.print("Boxcar\n");
         }
	   System.out.print("Continue? (y/n): ");
       choice = sc.next();
       System.out.println();
      }      
    }
  }
