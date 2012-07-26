/*
 * the game class for Four Stones
 * shuffles board, runs game
 * this class is the "meat" of the game, it does everything except the menu
 */

package fourStones;

import java.util.Scanner;

public class Game {

	public String[][] board = new String[4][10];

	public void shuffleBoard() {


		for (int x = 0; x < 4; x++ ) { // count the horizontal rows

			for ( int counter = 0; counter < 10; counter++ ) { //count the vertical rows

				board[x][counter] = "."; //fill board with .

			}
		}
		//these are placeholders, to be replaced with a semirandom letter placer in future
		board[0][2] = "A";
		board[0][3] = "B";
		board[0][7] = "C";
		board[1][6] = "D";
		board[2][2] = "E";
		board[2][8] = "F";
		board[3][1] = "G";
		board[3][3] = "H";
		board[3][5] = "I";
		board[3][9] = "J";


	}
	public void multiPlayer() {

		printBoard();

		Scanner gameInput = new Scanner(System.in);

		System.out.printf("\nPlayer 1, which letter would you like to move?\n");

		String letter = gameInput.next();

		System.out.printf("You are moving letter %s. How far would you like to move it?\n", letter);

		int howFar = gameInput.nextInt();

		System.out.printf("You are moving letter %s %s spaces left.\n\n", letter, howFar );


	}

	public void printBoard() {

		//printing out the game board
		System.out.printf("Here's the game board: \n\n");

		for (int y = 0; y < 4; y++ ) {
			for (int z = 0; z < 10; z++ ) {
				System.out.print(board[y][z]);
				if ( z == 9) {
					System.out.println();
				}
			}
		}
	}


}