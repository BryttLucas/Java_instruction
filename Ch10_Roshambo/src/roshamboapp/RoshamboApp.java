package roshamboapp;
import java.util.Scanner;

public class RoshamboApp {
	
		public void RockPaperScirrors()  {
	
	public static void main(String[] args) {
		
	    	char choice = 'y';
			char player;
			Player p = null;
			String name;
			
			Bart b = new Bart();
			Lisa l = new Lisa();
			
			System.out.println("Welcome to the Rashambo Game \n");
			
			String playerName = Validator.getString("Enter your name: ");	
			name =sc.next();
			
			String playerChoice = Validator.getString("Would you like to play Bart or Lisa?(B/L): ");
			player=sc.next().charAt(0);

			if(player=='b')
				p=b;
			
				else if(player=='l')
				p=l;
			
			while(choice=='y')

			{
			System.out.println("Rock, paper or scissors?(R/P/S)");
			String rps = sc.next();
			  
			Player1 p1 = new Player1();
			p1.setName(name);
			
			System.out.println(name+ ":" + rps);

			System.out.println(p.getName()+ ":" + p.generateRoshambo());
			  
			if(rps == p.generateRoshambo().toString())
			System.out.println("Draw!");
			else if(p1.generateRoshambo()==Roshambo.PAPER && p.generateRoshambo()==Roshambo.ROCK)
			System.out.println(p1.getName()+" Wins");
			else if(p1.generateRoshambo()==Roshambo.PAPER && p.generateRoshambo()==Roshambo.SCISSORS)
			System.out.println(p.getName()+" Wins!");
			else if(p1.generateRoshambo()==Roshambo.SCISSORS && p.generateRoshambo()==Roshambo.ROCK)
			System.out.println(p.getName()+" Wins");

			choice = Validator.getString(sc, "Play again?(y/n): ");
			System.out.println();
	   }
	   }
       }
		public class Validator {
			  
			public static String getString(String prompt)
			{
			String s = "";
			boolean isValid = false;
			Scanner sc=new Scanner(System.in);
			while (!isValid) 
			{
			System.out.print(prompt);
			s = sc.nextLine();
			if (!s.equals(""))
			isValid = true;
			}
			return s;
			}
			  
			public static String getString(Scanner sc, String prompt, String y, String n)
			{
			String s = null;
			boolean isValid = false;
			while (!isValid)
			{
			s = getString(prompt);
			if (s.equalsIgnoreCase("y") ||s.equalsIgnoreCase("n"))
			isValid = true;
			else
			System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
			}
			return s;
			}
			}