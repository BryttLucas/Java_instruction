package academy.learnprogramming;

public class CodingExercises {

	public static void main(String[] args) {
		int newScore = calculateScore ("Tim", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore();
		double centimeters = calcFeetAndInchesToCentimeters(6,0);
		 if(centimeters <0.0) {
			 System.out.println("Invalid parameters. ");
		 }
		 calcFeetAndInchesToCentimeters(157);
		
			}
			public static int calculateScore(String playerName, int score) {
				System.out.println("Player "+ playerName +" scored " + score + " point");
				return score * 1000;
			}
			public static int calculateScore(int score) {
				System.out.println("UnName Player scored " + score + " points");
				return score * 1000;
			}
			public static int calculateScore() {
				System.out.println(" No Player and no score.");
				return 0;
	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if ((feet <0 || ((inches<0) || (inches>12)))) {
			return-1;
			
		}
		double centimeters = (feet * 12) *2.54;
		centimeters += inches *2.54;
		System.out.println(feet + "Feet " + " inches = " + centimeters + " CM");
		return centimeters;
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches > 0) {
			return -1;
		}
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + "feet and "
				+ remainingInches + " inches.");
		return calcFeetAndInchesToCentimeters(feet,remainingInches);
	}
}
