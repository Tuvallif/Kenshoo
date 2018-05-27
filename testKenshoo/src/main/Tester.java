package main;

import java.util.Date;
import java.util.Random;

import tools.Game;
/**
 * This class test some regular and invalid input for the code
 * @author Tuval Lifshitz
 *
 */
public class Tester {
	
	Date d = new Date();
	Random rand = new Random(d.getTime());
	int n = rand.nextInt(11);
	
	Game GM;
	
	public Tester() {
		
	}
	
	public void randomTester() {
		GM = new Game();
		for(int i = 0; i < 50; i ++) {
			GM.roll(n);
			n = rand.nextInt(11);
			GM.score();
		}
		GM.roll(10);
	}
	
	public void illigelInputTester() {
		GM = new Game();
		for(int i = 0; i < 500; i ++) {
			GM.roll(n);
			n = rand.nextInt(100);
			GM.score();
		}
		GM.roll(10);
	}
	
	/**
	 * a tester for perfect score
	 */
	public void runPerferctScore() {
		GM = new Game();
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
		GM.roll(10);
		System.out.println(GM.score());
	}
	
	/**
	 * tester for only spares
	 */
	public void runSpares() {
		GM = new Game();
		GM.roll(5);
		GM.score();
		GM.roll(5);
		GM.score();
		GM.roll(2);
		GM.score();
		GM.roll(8);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(9);
		GM.score();
		GM.roll(10);	
		GM.score();
		GM.roll(2);
		GM.score();
		GM.roll(2);
		GM.score();
		GM.roll(5);
		GM.score();
		GM.roll(5);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(9);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(10);
		GM.score();
	}
	
	/**
	 * tester for all zero, not even one point
	 */
	public void allZero() {
		GM = new Game();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);	
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(0);
		GM.score();
	}
	
	public void lastThrowIsStrike() {
		GM = new Game();
		GM.roll(4);
		GM.score();
		GM.roll(3);
		GM.score();
		GM.roll(4);
		GM.score();
		GM.roll(2);
		GM.score();
		GM.roll(7);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(7);
		GM.score();
		GM.roll(0);
		GM.score();
		GM.roll(9);
		GM.score();
		GM.roll(0);	
		GM.score();
		GM.roll(5);
		GM.score();
		GM.roll(2);
		GM.score();
		GM.roll(5);
		GM.score();
		GM.roll(3);
		GM.score();
		GM.roll(3);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(7);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(9);
		GM.score();
		GM.roll(10);
		GM.score();
	}
	/**
	 * only one strike in a game
	 */
	public void oneStrike() {
		GM = new Game();
		GM.roll(0);
		GM.score();
		GM.roll(4);
		GM.score();
		GM.roll(5);
		GM.score();
		GM.roll(4);
		GM.score();
		GM.roll(2);
		GM.score();
		GM.roll(7);
		GM.score();
		GM.roll(3);
		GM.score();
		GM.roll(7);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(0);	
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(1);
		GM.score();
	}
	
	/**
	 * tester for spares and strikes 
	 */
	public void sparesAndStrikes() {
		GM = new Game();
		GM.roll(0);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(9);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(2);
		GM.score();
		GM.roll(8);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(3);	
		GM.score();
		GM.roll(7);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(4);
		GM.score();
		GM.roll(6);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(5);
		GM.score();
		GM.roll(5);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(6);
		GM.score();
		GM.roll(4);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(7);
		GM.score();
		GM.roll(3);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(8);
		GM.score();
		GM.roll(2);
		GM.score();
		GM.roll(10);
		GM.score();
		GM.roll(9);
		GM.score();
		GM.roll(1);
		GM.score();
		GM.roll(10);
		GM.score();
	}

}
