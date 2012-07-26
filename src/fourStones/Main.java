/* 
 * the main class for Four Stones
 * provides menu, calls board shuffling and game start classes
 */


package fourStones;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Game game = new Game(); //create the object for game class

		Scanner scanning = new Scanner(System.in); // create the input
		
		System.out.println("Welcome to Four Stones!");
		System.out.println("What would you like to do?");
		System.out.printf("[S]tart a new game,\n" +
				"[R]ead the rules,\n" +
				"or [c]lose the game?\n\n");
		
		//placeholder input; will be replaced by actual keyboard input in the future
		
		String input = scanning.next();
		
		if( input.contains( "s" ) ) {
			
			System.out.printf("Would you like to play [s]ingleplayer or [m]ultiplayer?\n");
			
			input = scanning.next();
			
			if ( input.contains( "m" ) ) {
				System.out.printf("Starting multiplayer...\n\n");
				
				game.shuffleBoard(); //shuffle the board
				
				game.multiPlayer(); //run multiplayer
			}
			
			else {
				System.out.println("Please enter either 'm' or 's'.");
			}
			
		}

	}

}
