/**
 * 
 */
package gameSnakeAndLadder;

import java.util.Random;

/**
 * A die simulator
 * @author luis_
 *
 */
public class Die {
	
	public int getRoll() {
		Random randomNumberGenerator = new Random();
		int face = randomNumberGenerator.nextInt(6)+1;
		return face;
	}

}
