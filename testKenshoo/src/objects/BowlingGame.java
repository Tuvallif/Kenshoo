package objects;

/**
 * This class implements interface Game as a bowling game
 * foe more information about bowling and the game rules go to: https://en.wikipedia.org/wiki/Bowling
 * @author Tuval Lifshitz
 *
 */
public class BowlingGame implements GameInterface{

	//current frame that the game is in range 0-11(for extra two 
	//in case of ending with strikes/spares)
	private int currentFrame;
	//current throw that the game is in - range 0-1
	private int currentThrow;
	//all the frames of the game
	private Frame[] frames;
	private int score;
	
	/**
	 * constructor for the bowling game, 
	 * initials everything at 0, and number of frames at 12 for the extra ones
	 */
	public BowlingGame() {
		currentFrame = 0;
		currentThrow = 0;
		score = 0;
		frames = new Frame[12];
	}
	

	@Override
	public void play(int pins) throws Exception{
		if(currentThrow < 0 || currentThrow > 1) {
			throw new Exception("number of throw is illegal!");
		}
		else if(currentFrame < 0) {
			throw new Exception("number of frame is illegal! - must be positive");
		}
		else if(currentFrame == 10 && (!frames[currentFrame-1].isStrike() && !frames[currentFrame-1].isSpare())) {
			throw new Exception("Game ended, hope you had fun!");
		}
		else if(currentFrame == 11 && (!frames[currentFrame-1].isStrike())){
			throw new Exception("Game ended, hope you had fun!");
		}
		else{
			//current frame was not initialized yet
			if(currentThrow == 0) {
				frames[currentFrame] = new Frame();
			}
			int leftPins = frames[currentFrame].throwBall(pins, currentThrow);
			if(leftPins == 0) {
				//making sure not null pointer Exception
				if(currentFrame-1 >= 0) {
					if(frames[currentFrame-1].isStrike()) {
						frames[currentFrame-1].addToScore(frames[currentFrame].getScore());
					}
					else if(frames[currentFrame-1].isSpare()) {
						frames[currentFrame-1].addToScore(frames[currentFrame].getThrow(0));
					}
				}
				//checking for double strike - but first for null pointer exception
				if(currentFrame-2 >= 0) {
					if(frames[currentFrame-2].isStrike() && frames[currentFrame-1].isStrike()) {
						frames[currentFrame-2].addToScore(frames[currentFrame-1].getThrow(0) + frames[currentFrame-1].getThrow(1) );
					}
				}
				//finally increasing the frame to next one
				currentThrow = 0;
				currentFrame = currentFrame + 1;
			}
			else {
				currentFrame = currentFrame + ( currentThrow / 2);
				currentThrow = (currentThrow + 1) % 2;				
			}
			if(currentFrame < 10) {
				score += pins;
			}
		}
		
	}
	

	@Override
	public int getCurrentScoreWithPrints() {
		int toReturn = 0;
		System.out.println(" ");
		System.out.println("&*&^^%$&$&#$%&$%&#$&%$&@$^$%$#  PRINT  &%$^$%$^$#%&^^&%$^%^#$^#^@^#$^");
		for(int i = 0; i < Math.min(currentFrame, 10) ; i++) {
			System.out.println(" ");
			System.out.println("****************frame number " + i + " **********************");
			System.out.print("*     ");
			System.out.println("the score for frame " + i + " is " + frames[i].getScore() + "                   *");
			System.out.print("*     ");
			System.out.println("the frame 0 is " + frames[i].getThrow(0)+ "                             *");
			System.out.print("*     ");
			System.out.println("the frame 1 is " + frames[i].getThrow(1)+ "                              *");
			System.out.print("*     ");
			toReturn += frames[i].getScore();
			System.out.println("the current total until this point is " + toReturn +    "     *");
			System.out.println("****************frame number " + i + " **********************");
			System.out.println(" ");
			
		}
		//checking if there is a last one
		if(currentThrow != 0) {
			System.out.println(" ");
			System.out.println("****************frame number " + currentFrame + " **********************");
			System.out.print("*     ");
			System.out.println("the score for frame " + currentFrame + " is " + frames[currentFrame].getScore() +"               *");
			System.out.print("*     ");
			toReturn += frames[currentFrame].getScore();
			System.out.println("the current total until this point is " + toReturn +    "     *");
			System.out.println("****************frame number " + currentFrame + " **********************");
			System.out.println(" ");
			
		}
		System.out.println("the current score is " + toReturn);
		System.out.println("&*&^^%$&$&#$%&$%&#$&%$&@$^$%$#  END PRINT  &%$^$%$^$#%&^^&%$^%^#$^#^@^#$^");
		System.out.println(" ");
		return toReturn;
	}
	
	
	
	@Override
	public int getCurrentScore() {
		int toReturn = 0;
		for(int i = 0; i < Math.min(currentFrame, 10) ; i++) {
			toReturn += frames[i].getScore();			
		}
		//checking if there is a last one
		if(currentThrow != 0) {
			toReturn += frames[currentFrame].getScore();		
		}
		System.out.println(toReturn);
		return toReturn;
	}
	
	
	
	
	
	
	

}
