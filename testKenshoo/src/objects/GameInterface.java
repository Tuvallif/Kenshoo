package objects;

/**
 * This is an interface for games, you can play or get score 
 * @author Tuval
 *
 */
public interface GameInterface {
	
	/**
	 * This method is one turn in a game, 
	 * that will be implemented according to the implementing game
	 * @param pins The number of pins knocked down
	 * @throws Exception in case of invalid input, too much turns
	 */
	public void play(int pins) throws Exception;
	
	/**
	 * This method returns the current score of the game
	 * @return the current score of the game
	 */
	public int getCurrentScore();

	/**
	 * This method is for debug purposes and does the same as getCurrentScore, 
	 * only prints every frame and throw
	 * @return the current score of the game
	 */
	int getCurrentScoreWithPrints();
	
	

}
