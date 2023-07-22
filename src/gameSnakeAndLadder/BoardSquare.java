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
	 * If not null it indicates there is a snake or a ladder in the square
	 */
	private Mover mover = null;
	
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
	 * Setter of the mover
	 * @param m The mover
	 */
	public void setMover(Mover m) {
		mover = m;
	}
	/**
	 * Moves a player to this square and then applies a ladder or a snake if needed
	 * @param counter The player that reaches this square 
	 */
	void movePlayerPiece(PlayerPiece counter) {
		counter.setCurrentPosition(this);
		if (mover!=null) {
			mover.movePlayerPiece(counter);
		}
	}
}
