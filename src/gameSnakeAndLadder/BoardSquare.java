/**
 * 
 */
package gameSnakeAndLadder;

/**
 * @author luis_
 * A location on the board. It may contain the head of a sneak, the foot of a ladder or none of them.
 */
class BoardSquare {
	/**
	 * If not null, then the sqaure has a snake's head
	 */
	private Snake aSnake = null;
	
	/**
	 * If not null, then the square has a ladder's foot
	 */
	private Ladder aLadder = null;
	
	/**
	 * The position of the square on the board
	 */
	private int position;
	
	/**
	 * 
	 * @param position Setter method
	 */
	private void setPosition(int position) {
		this.position = position;
	}
	
	/**
	 * 
	 * @return The position of the Square
	 */
	int getPosition() {
		return position;
	}
	
	/**
	 * Constructor
	 * @param position The position of the square
	 */
	BoardSquare(int position) {
		setPosition(position);
	}
	
	/**
	 * Adds a ladder to the Square
	 * @param l A ladder
	 */
	void setLadder(Ladder l) {
		aLadder = l;
	}
	
	/**
	 * Adds a snake to the Square
	 * @param s A snake
	 */
	void setSnake(Snake s) {
		aSnake = s;
	}
	/**
	 * Determines whether there is a ladder in the square
	 * @return True if there is a ladder on it
	 */
	private boolean getLadder() {
		return null != aLadder;
	}
	/**
	 * Determines whether there is a snake in the square
	 * @return True if there is a snake on it
	 */
	private boolean getSnake() {
		return null != aSnake;
	}
	/**
	 * Moves a player to this square and then applies a ladder or a snake if possible
	 * @param counter The player that reaches this square 
	 */
	void movePlayerPiece(PlayerPiece counter) {
		counter.setCurrentPosition(this);
		if(getSnake()) {
			aSnake.movePlayerPiece(counter);
		}
		if(getLadder()) {
			aLadder.movePlayerPiece(counter);
		}
	}
}
