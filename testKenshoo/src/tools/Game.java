
package tools;
import objects.BowlingGame;
import objects.GameInterface;

/**
 * This is the method that actually runs the game interface
 * It has two methods
 * @author Tuval Lifshitz
 *
 */
public class Game{
	
	//the gameInterface that this class is running - can be replaced by a different game
	GameInterface bowling;
	
	/**
	 * the constructor that initializes the game interface as bowling game
	 */
	public Game() {
		bowling = new BowlingGame();
	}


	/**
	 * the "play" method, in bowling we roll so therefor the name.
	 * This method is called for each roll with number of pins knocked down.
	 * the valid input is implemented in the game, to make the operator class more generic
	 * @param pins number of pins knocked down
	 */
	public void roll(int pins) {
		try {
			bowling.play(pins);	
		}
		//making sure no exceptions
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
	}

	/**
	 * this method returns the total score for that game.
	 * @return total score of the game until current point
	 */
	public int score() {
		return bowling.getCurrentScore();
		//return bowling.getCurrentScoreWithPrints();
	}
	
	
	
}
