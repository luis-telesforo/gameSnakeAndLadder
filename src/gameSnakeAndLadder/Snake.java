/**
 * 
 */
package gameSnakeAndLadder;

/**
 * @author luis_
 * A snake. The tail of the snake indicates where a player must move after reaching the head of the snake.
 */
class Snake extends Mover {
	/**
	 * The tail of the snake.
	 */
	private BoardSquare tail;
	
	/**
	 * 
	 * @param tail Setter method
	 */
	private void setTail (BoardSquare tail) {
		this.tail = tail;
	}
	
	/**
	 * 
	 * @return The position of the tail
	 */
	private BoardSquare getTail() {
		return tail;
	}
	
	/**
	 * Constructor
	 * @param head The BoardSquare where the head is located
	 * @param tail The BoardSquare where the tail is located
	 */	
	Snake(BoardSquare head,BoardSquare tail) {
		super(head, tail);
		setTail(tail);
		head.setMover(this);
	}
	/**
	 * Moves the player to the square determined by the constructor
	 * @param counter
	 */
	@Override
	void movePlayerPiece (PlayerPiece counter) {
		counter.setCurrentPosition(getTail());
		System.out.println("Player "+counter.getColor()+" goes down a snake to "+getTail().getPosition());
	}

}
