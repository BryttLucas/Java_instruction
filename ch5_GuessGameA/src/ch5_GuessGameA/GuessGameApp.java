package ch5_GuessGameA;

import java.util.Scanner;

public class GuessGameApp {
		
		public static void displayWelcome() {
			
			System.out.println("Welcome to the Guessing Game!\n");
			System.out.println("+++++++++++++++++++++++++++++++++");
			System.out.println("I'm thinking of a number from 1 to 100.");
			System.out.println("Try to guess it!\n");
			
			Scanner sc = new Scanner(System.in);
			String choice = "y";
		    choice.equalsIgnoreCase("y");
			
			do {
				int randomNum = (int)(Math.random()*100) +1;
				boolean isCorrect = false;
				int attempt = 0;
				
				while(!isCorrect) {
					int guess = getIntWithinRange(sc,"Guess a number: ",1,100);
					
					if(guess < (randomNum-10)) {
						System.out.println("Your guess is WAY to low");
						attempt++;
						continue;
					}
					if(guess < randomNum) {
						System.out.println("Too low Guess again.");
						attempt++;
						continue;
					}
					if(guess > randomNum+10) {
						System.out.println("Your WAY too high!");
						attempt++;
						continue;
					}
					if(guess > randomNum) {
						System.out.println("Too high Guess again");
						attempt++;
						continue;
					}
					attempt++;
					isCorrect = true;
					}
				System.out.println("Congrats, you got it right and it only took you "+attempt+" tries.");
				if(attempt > 7) {
					System.out.println("Not too bad! You've got some potential.");
				}else if (attempt > 3) {
					System.out.println("Great work! You are a mathematical wizard.");
				}else {
					System.out.println("What took you so long? Maybe you should take some lessons.");
				}
				
				System.out.print("Continue? (y/n)");
				choice = sc.nextLine();
			}while(choice.equalsIgnoreCase("y"));
			
		System.out.println("Goodbye!");
		sc.close();
		}
		
		
		private static int getIntWithinRange(Scanner sc,String prompt,int min,int max) {
			boolean isValid = false;
			int input = 0;
			while(!isValid) {
				System.out.print(prompt);
				if(sc.hasNextInt()) {
					input = sc.nextInt();
				}else {
					System.out.println("I need a number please.");
					sc.nextLine();
					continue;
				}
				if(input < min) {
					System.out.println("Needs to be at least " + min + " , from you.");
					sc.nextLine();
					continue;
				}
				else if(input > max) {
					System.out.println("Needs to be " + max + " or less, at this time.");
					sc.nextLine();
					continue;
				}else {
					sc.nextLine();
					isValid = true;
				}
					
			}
			return input;
		}
	}


