package objects;

/**
 * This class is a part of Bowling game, 
 * it is a frame of a bowling, meaning two throws, max up to 10 pins(points)
 * @author Tuval Lifshitz
 *
 */
public class Frame {
	
	//if this frame is a strike
	private boolean isStrike;
	//if this frame is a spare
	private boolean isSpare;
	//up to two throws for each frame
	private Throw[] bowlingThrows;
	//the score of the frame
	private int score;
	//the number of standing pins - starts 10, 
	//after first throw it will change, after second throw always 0
	private int standingPinsLeft;
	
	/**
	 * The constructor for the class, initialized everything according to a new frame
	 */
	Frame(){
		isStrike = false;
		isSpare = false;
		score = 0;
		standingPinsLeft = 10;
		//two throws for a frame
		bowlingThrows = new Throw[2];
	}
	
	/**
	 * this method returns false if the score is not final,
	 * would be used for the last frame, to see if any other frames are needed
	 * @return true if score is final, false otherwise,
	 *  meaning needs another frame to be added
	 */
	public boolean isScoreFinal() {
		return (!isStrike || !isSpare);
	}
	
	/**
	 * This method is being called after roll(), and it is the ball throwing.
	 * it has most of the logistic and game rules.
	 * @param pins number of pins knocked down, can not be greater than 10 for first throw
	 * and could not be greater than standingpinsLeft for second throw. always >=0
	 * @param throwNumber the number of throw, would receive this parameter from bowlingGame
	 * @return the number of standing pins left, for second throw, always returns 0
	 * @throws Exception for illegal input
	 */
	public int throwBall(int pins, int throwNumber) throws Exception {
		//making sure legal input for throw number
		if(throwNumber < 0 || throwNumber > 1) {
			throw new Exception("the throw number is illegal, please a number between 0 - 1");
		}
		else if(pins < 0 || pins > standingPinsLeft) {
			throw new Exception("the number of pins is illegal, please a number between 1 - " + standingPinsLeft);
		}
		bowlingThrows[throwNumber] = new Throw(pins);
		score = score + pins;
		standingPinsLeft = standingPinsLeft - pins;
		//strike or spare
		if(standingPinsLeft == 0) {
			//strike
			if(throwNumber == 0) {
				isStrike = true;
				bowlingThrows[1] = new Throw(0);
			}
			//spare
			else {
				isSpare = true;
			}
		//checking if last round
		}else if(throwNumber == 1) {
			standingPinsLeft = 0;
		}
		
		return standingPinsLeft;
		
	}
	
	/**
	 * this method returns the state of the frame regarding spare situation
	 * @return true if frame is spare, false otherwise
	 */
	public boolean isSpare() {
		return isSpare;
	}
	
	/**
	 * this method returns the state of the frame regarding strike situation
	 * @return true if frame is strike, false otherwise
	 */
	public boolean isStrike() {
		return isStrike;
	}
	/**
	 * This method sets the score for the frame
	 * @param score the new score for the frame
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * This method adds additional points to the current score
	 * @param addScore the number of points to add to the score
	 */
	public void addToScore(int addScore) {
		this.score = this.score + addScore;
	}
	/**
	 * return the score of the frame, not taking under consideration extra point, 
	 * they would be calculated outside the method
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * this method is sending back the number of points in a specific throw
	 * @param throwNumber a number of throw, can be between 0-1
	 * @return the score for the throw
	 */
	public int getThrow(int throwNumber) {
		if(bowlingThrows != null && bowlingThrows[throwNumber] != null) {
			return bowlingThrows[throwNumber].getThrow();
		}
		
		return 0;
	}
	
	

}
