/* 
 * the main class for Four Stones
 * provides menu, calls board shuffling and game start classes
 */


package fourStones;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Game game = new Game();
		
		
		System.out.println("Welcome to Four Stones!");
		System.out.println("What would you like to do?");
		System.out.printf("[S]tart a new game,\n" +
				"[R]ead the rules,\n" +
				"or [c]lose the game?\n\n");
		
		String input = "s";
		if( input == "s" ) {
			
		}
		
		

	}

}
