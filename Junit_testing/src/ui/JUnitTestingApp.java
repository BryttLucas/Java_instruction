package ui;

import business.JUnitTesting;
import util.Console;

public class JUnitTestingApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the JUnit Testing App!");
		
		int i= Console.getInt("Give an interger to find the square. ");
		JUnitTesting junit = new JUnitTesting();
		i = junit.square(i);
		
		System.out.println("Answer " + i);
		String str = Console.getString("Enter your text. ");
		int aCount = junit.countA(str);
		
		System.out.println("Your text contains "+aCount+" 'a's.");
		
		System.out.println("Bye!");
	}
		
}
