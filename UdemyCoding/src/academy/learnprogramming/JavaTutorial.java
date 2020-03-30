package academy.learnprogramming;

public class JavaTutorial {

	public static void main(String[] args) {
		int myValiable = 50;
		if (myValiable == 50) {
			System.out.println("Printed.");
		}

		myValiable++;
		myValiable--;
		System.out.println("this is a test.");

		System.out.println("this is " + "another " + "still more.");

		int anotherVariable = 50;
		myValiable--;
		System.out.println("this is another one.");
		;
		// white spaces needed to make code easy to read.

//     gameOver = true;
//	   int score = 5000;
//	   int levelCompleted = 5;
//	   int bonus = 100;
//	       if(score == 5000) //{  last line will not work without the code block
//	    	System.out.println("Your score was 5000.");
		// }
//	        System.out.println("This well not be executed.");

		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		{

			if (score < 5000 && score > 1000) {
				System.out.println("Your score was less than 5000 but greater thab 1000.");
			} else if (score < 1000) {
				System.out.println("Your score was less than 1000.");
			} else {
				System.out.println("Got here.");

			}
		}
	}
} 
