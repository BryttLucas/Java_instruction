
import java.util.Scanner;

public class Connect4GameApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Create two players and get their names from user input

		System.out.println("Welcome to Connect Four Game!");
		
		System.out.println("Player One please enter your name: ");
		String player1_name = sc.nextLine();
		System.out.println("Player Two Enter your name: ");
		String player2_name = sc.nextLine();
		
		Player playerOne = new Player(player1_name);
		Player playerTwo = new Player(player2_name);
		System.out.println(playerOne.getName() + ",You will be red color(R on the board)");
		System.out.println(playerTwo.getName() + ",You will be yellow (Y on the board)\n");

		ConnectFour connectFour = new ConnectFour(playerOne, playerTwo);
		connectFour.printGameBoard();
		System.out.println("\n");
		boolean playerWins = false;
		while (playerWins == false) {

			// Create the players to make their moves

			System.out.println(playerOne.getName() + ", Please enter the column number to make your move.");
			int move = sc.nextInt();
			while (connectFour.makeMove(playerOne, move) == false) {
				System.out.println("Please try again: ");
				move = sc.nextInt();
			}
			connectFour.printGameBoard();
			int winner = connectFour.StatusGameBoard();
			personWins(winner);
			if (winner != -1) {
				playerWins = false;
				break;
			}
			System.out.println(playerTwo.getName() + ", Please enter the column number to make your move.");
			move = sc.nextInt();
			while (connectFour.makeMove(playerTwo, move) == false) {
				System.out.println("Please try again: ");
				move = sc.nextInt();
			}
			connectFour.printGameBoard();
			winner = connectFour.StatusGameBoard();
			personWins(winner);
			if (winner != -1) {
				playerWins = false;
				break;

			}
		}
	}

	// Create the wins remarks

	private static void personWins(int winner) {
		if (winner == 0) {
			System.out.println("It's a tie!");
		}

		else if (winner == 1) {
			System.out.println("Player One wins!");
		}

		else if (winner == 2) {
			System.out.println("Player Two wins!");
		}

		else {
			System.out.println("No winner yet!\n");
		}
	}
}



