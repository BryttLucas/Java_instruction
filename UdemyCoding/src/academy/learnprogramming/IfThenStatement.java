package academy.learnprogramming;

public class IfThenStatement {

	public static void main(String[] args) {
		
		boolean isAlien = false;
		if (isAlien == false) {   //(!isAlien)
			System.out.println("It is not an alien!");
		    System.out.println("And I am scared of aliens.");
		}
		
		int topScore = 80;
		if(topScore < 100) {
			System.out.println("You got the high score!");
		}
		int secondTopScore = 81;
		if ((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Greater than scond top score and less than 100.");
		}
		if ((topScore > 90 || secondTopScore <= 90)) {
			System.out.println("Either or both of the conditions are true");
		}
		int newValue = 50;
		if( newValue == 50) {
			System.out.println("This is true.");
		}
		boolean isCar = false;
		if (isCar) {
			System.out.println("This is supposed to happen.");
		}
		isCar = true;{
		boolean wasCar = isCar ? true : false;
		System.out.println("wasCar is true.");
	    }
		double doubleValue = 20.00d;
		double doubleValue2 = 80.00d;
		double valuesTotal = (doubleValue + doubleValue2) * 100.00d;
		System.out.println("valuesTotal =" + valuesTotal);
		double theRemainder = valuesTotal % 40.00d;
		System.out.println("The Remainder  = " + theRemainder);
		boolean isNoRemainder = (theRemainder ==0)? true : false;
		System.out.println("isNoRemainder = " + isNoRemainder);
		if (!isNoRemainder) {
			System.out.println("Got some remainder");
		}
	}
		
}

