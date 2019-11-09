package connectFour;

import java.util.Scanner;

public class ConnectFour
{
    private static char board[][];
    private static final int BOARD_WIDTH = 7;
    private static final int BOARD_HEIGHT = 6;
    private static boolean gameEnd = false;
public static void main(String[] args)
{
    // Element #0 in the two-dimensional 'board' array is not used
    // so that the column numbers selected by the players match
    // with the actual internal element numbers of the array

    board = new char[BOARD_HEIGHT + 1][BOARD_WIDTH + 1];
    Scanner input = new Scanner(System.in);
    char turn = 'x';
    int dropColumn = 0;

    System.out.println("TWO PLAYER CONNECT FOUR GAME!");
    InitializeBoard();
    while (gameEnd == false)
    {
        DisplayBoard();
        dropColumn = GetDropColumn(turn, input) - 1;

        if (DropChecker(turn, dropColumn) == true)
        {
            turn = 'x' == turn ? 'o' : 'x'; //ternary operator
        }
        else {
            System.out.println("Column full. Please input again.");
        }
    }
}

// Set all elements of the two-dimensional 'board' array to spaces
private static void InitializeBoard()
{
    char a = ' ';
    for (int i = 0; i < board.length; i++)
    {
        for (int e = 0; e < board[i].length; e++)
            board[i][e] = a;
    }
}

// Display the game board (the board itself, along with the elements of
// the two-dimensional 'board' array); note that the lines of the game
// board are NOT stored in the two-dimensional 'board' array
private static void DisplayBoard()
{
    for (int row = 0; row < board.length; row++)
    {
        for (int col = 0; col < board.length; col++)
        {
            System.out.print("|");
            System.out.printf("%2c", board[row][col]);
        }
        System.out.println();
    }
}

// Get (from the appropriate player) the number (1 – 'BOARD_WIDTH') of
// the column in which a checker should be dropped, and then return that
// number; if the player does not enter an integer, report the error and
// keep asking for a column number until an integer is entered; note that
// the check for an invalid column number (< 1 or > 'BOARD_WIDTH') can be
// performed in this method or in 'main', from where this method is called
private static int GetDropColumn(char turn, Scanner input)
{
    int numInput = 0;
    int realInput = 0;
    while (realInput == 0)
    {
        try
        {
            System.out.println("Player " + turn + "'s turn: In which column would you like to place a checker? (1-7)");
            numInput = input.nextInt();
            if (numInput < 1 || numInput > BOARD_WIDTH)
            {
                numInput = 0;
                System.out.println("The number was out of bounds. Please try again.");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid input. Please try again.");
        }
        realInput = numInput;
    }
    return realInput;
}

// "Drop" a checker into the designated column by setting the
// appropriate element of the two-dimensional 'board' array to
// either an 'x' or an 'o'; if the "drop" was successful, this
// method returns "true"; an attempt to "drop" the checker into
// a full column results in "false" being returned
private static boolean DropChecker(char turn, int dropColumn)
{
    int indexToPaceChecker = BOARD_HEIGHT;
    while (indexToPaceChecker >= 0)
    {
        if (board[indexToPaceChecker][dropColumn] == ' ')
        {
            //drop the checker
            board[indexToPaceChecker][dropColumn] = turn;
            return true;
        }
        indexToPaceChecker--;
    }
    return false;
}

// Check for a (horizontal, vertical, or diagonal) line of four
// consecutive checkers in the game board; if found, "true" is
// returned; if not found, "false" is returned
{

}
}
