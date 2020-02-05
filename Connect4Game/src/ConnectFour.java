import java.util.HashSet;
import java.util.Set;

public class ConnectFour {
	
	// Create the Game board
	
	//[0,0][0,1][0,2][0,3][0,4][0,5][0,6][0,7]
	//[1,0][1,1][1,2][1,3][1,4][1,5][1,6][1,7]
	//[2,0][2,1][2,2][2,3][2,4][2,5][2,6][2,7]
	//[3,0][3,1][3,2][3,3][3,4][3,5][3,6][3,7]
	//[4,0][4,1][4,2][4,3][4,4][4,5][4,6][4,7]
	//[5,0][5,1][5,2][5,3][5,4][5,5][5,6][5,7]
	//[6,0][6,1][6,2][6,3][6,4][6,5][6,6][6,7]
	
    private final int[][] gameBoard;
    private static final int ROWS = 6;
    private static final int COLUMNS = 7;
    private static final int RED = 1;
    private static final int YELLOW = 2;

    public ConnectFour(Player playerOne, Player playerTwo) {
        this.gameBoard = new int[ROWS][COLUMNS];
       
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                gameBoard[i][j] = -1;
            }
        }
    }

    public boolean makeMove(Player player, int column) {
        // Row position is determined by how many pieces are currently in a given column
        

        //Column value by 1, as our array is zero indexed.
        column--;

        //Check if the column chosen is valid
        if (column < 0 || column >= COLUMNS) {
            System.out.println("Column choice less than 6!");
            return false;
        }

        //Check if Column Full
        if  (ColumnFull(column)) {
            System.out.println("This column is full!");
            return false;
        }
        // Change the value in each Column
        else {
            for (int i = ROWS - 1; i >= 0; i--) {
                if (gameBoard[i][column] == -1) {
                    gameBoard[i][column] = player.getPlayerNumber();
                    break;
                }
            }
            return true;
        }

    }

    public int StatusGameBoard() {
        //Check each row, column, diagonal for four sequential pieces of the same column
        //Return -1 if no current winner,
    	//Return 0 if the board is full, indicating a tie
        //Return 1 if player one wins
        //Return 2 if player two wins

        if (BoardFull()) {
            System.out.println("The board is full!");
            return 0;
        }
        int checkRows = statusRows();
        int checkColumns = statusColumns();
        int checkDiagonals = statusDiagonals();
        if (checkRows == 1 || checkColumns == 1 || checkDiagonals == 1) {
            return 1;
        } else if (checkRows == 2 || checkColumns == 2 || checkDiagonals == 2) {
            return 2;
        } else {
            return -1;
        }
    }

    private int statusRows() {
       
        //Get the status the rows we do the following
        //Each of these column values in a hash set.
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS - 3; j++) {
                Set<Integer> pieceSet = new HashSet<Integer>();
                pieceSet.add(gameBoard[i][j]);
                pieceSet.add(gameBoard[i][j + 1]);
                pieceSet.add(gameBoard[i][j + 2]);
                pieceSet.add(gameBoard[i][j + 3]);
                if (pieceSet.size() == 1) {

                    if (pieceSet.contains(RED)) {
                        //Player One Wins
                        return RED;
                    } else if (pieceSet.contains(YELLOW)) {
                        //Player Two Wins
                        return YELLOW;
                    }
                }
            }
        }

        return -1;
    }

    private int statusColumns() {
       
        //Status of columns,are similar hash set status process to the rows.
  
        for (int j = 0; j < COLUMNS; j++) {
            for (int i = ROWS - 1; i >= 3; i--) {

                Set<Integer> pieceSet = new HashSet<Integer>();
                pieceSet.add(gameBoard[i][j]);
                pieceSet.add(gameBoard[i - 1][j]);
                pieceSet.add(gameBoard[i - 2][j]);
                pieceSet.add(gameBoard[i - 3][j]);
                if (pieceSet.size() == 1) {
                    //A winner
                    if (pieceSet.contains(RED)) {
                        //Player one Wins
                        return RED;
                    } else if (pieceSet.contains(YELLOW)) {
                        //Player two Wins
                        return YELLOW;
                    }
                }
            }
        }
        return -1;
    }

    private int statusDiagonals() {
        //The first row(left to right), and check all diagonals that can fit more than 4 pieces.
        //Check status all left diagonals (diagonals which connect the top row to the left most column)
       
        for (int i = 3; i < COLUMNS; i++) {
            int j = 0; 
            int k = i;
            while (k - 3 >= 0 && j + 3 < ROWS) {
                Set<Integer> pieces = new HashSet<>();
                pieces.add(gameBoard[j][k]);
                pieces.add(gameBoard[j + 1][k - 1]);
                pieces.add(gameBoard[j + 2][k - 2]);
                pieces.add(gameBoard[j + 3][k - 3]);
                if (pieces.size() == 1) {
                    if (pieces.contains(RED)) {
                        return RED;
                    } else if (pieces.contains(YELLOW)) {
                        return YELLOW;
                    }
                }
                j++;
                k--;

            }

        }

        //Getting Status move down the right most column for each diagonal
  
        for (int i = 1; i < 3;i++) {
            int j = i; 
            int k = COLUMNS - 1;

            while (j + 3 < ROWS && k - 3 >= 0) {
                Set<Integer> pieces = new HashSet<>();
                pieces.add(gameBoard[j][k]);
                pieces.add(gameBoard[j + 1][k - 1]);
                pieces.add(gameBoard[j + 2][k - 2]);
                pieces.add(gameBoard[j + 3][k - 3]);

                if (pieces.size() == 1) {
                    if (pieces.contains(RED)) {
                        return RED;
                    } else if (pieces.contains(YELLOW)) {
                        return YELLOW;
                    }
                }
                j++;
                k--;
            }
        }

        // Repeat the above process by the status from each left diagonal
       
        for (int i = COLUMNS - 4; i >= 0; i--) {
            int j = 0; 
            int k = i;

            while (j + 3 < ROWS && k + 3 < COLUMNS) {
                Set<Integer> pieces = new HashSet<>();
                pieces.add(gameBoard[j][k]);
                pieces.add(gameBoard[j + 1][k + 1]);
                pieces.add(gameBoard[j + 2][k + 2]);
                pieces.add(gameBoard[j + 3][k + 3]);

                if (pieces.size() == 1) {
                    if (pieces.contains(RED)) {
                        return RED;
                    } else if (pieces.contains(YELLOW)) {
                        return YELLOW;
                    }
                }
                j++;
                k++;
            }
        }

       // Lastly, Move down the left column and check each diagonal which connects the left column
   
        for (int i = 1; i < 3; i++) {
            int j = i;
            int k = 0;
            while (j + 3 < ROWS && k + 3 < COLUMNS) {
                Set<Integer> pieces = new HashSet<>();
                pieces.add(gameBoard[j][k]);
                pieces.add(gameBoard[j + 1][k + 1]);
                pieces.add(gameBoard[j + 2][k + 2]);
                pieces.add(gameBoard[j + 3][k + 3]);

                if (pieces.size() == 1) {
                    if (pieces.contains(RED)) {
                        return RED;
                    } else if (pieces.contains(YELLOW)) {
                        return YELLOW;
                    }
                }
                j++;
                k++;
            }

        }
        return -1;
    }

    private boolean ColumnFull(int columnNumber) {
        //Check if Status of the column must be full.
        if (gameBoard[0][columnNumber] == -1) {
            return false;
        } else {
            return true;
        }
    }

    private boolean BoardFull() {
        //If any value in our board is -1, the board is not full
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (gameBoard[i][j] == -1) {
                    return false;
                }
            }
        }
        //The board is full
        return true;
    }

    public void printGameBoard() {
        System.out.println("==============================");
        System.out.println("1 2 3 4 5 6 7");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (gameBoard[i][j] == RED) {
                    System.out.print("R ");
                } else if (gameBoard[i][j] == YELLOW) {
                    System.out.print("Y ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("==============================");
    }

    public void clearBoard() {
        //Reset board position to -1
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                gameBoard[i][j] = -1;
            }
        }
    }
}
