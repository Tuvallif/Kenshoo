
package objects;

/**
 * This class is a throw in a frame of a bowling game,
 * two throws together can go high as 10
 * @author Tuval Lifshitz
 *
 */
public class Throw {
	
	//the score of the throw
	private int throwScore;
	
	/**
	 * initials the number of knocked down pins  of the throw
	 * valid and logical input check is being done outside this constructor
	 */	
	public Throw(int pins) {
		throwScore = pins;
	}
	
	/**
	 * this method send back the number of knocked down pins in this throw
	 * @return the number of point of the throw, can be between 0-10
	 */
	public int getThrow() {
		return throwScore;
	}
	
	/**
	 * this message sets the number of knocked down pins(points) for t this throw
	 *  valid and logical input check is being done outside this constructor
	 * @param pins the number of knocked down pins for the throw
	 */
	public void setThrow(int pins) {
		throwScore = pins;
	}

}
