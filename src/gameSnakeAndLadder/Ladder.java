/**
 * 
 */
package gameSnakeAndLadder;

/**
 * @author luis_
 * A ladder. The top of the snake indicates where a player must move after reaching the foot of the snake.
 */
class Ladder extends Mover{
	
	/**
	 * The top of the ladder.
	 */
	private BoardSquare top;
	
	/**
	 * 
	 * @param top Setter method
	 */
	private void setTop (BoardSquare top) {
		this.top = top;
	}
	
	/**
	 * 
	 * @return The position of the top
	 */
	private BoardSquare getTop() {
		return top;
	}
	
	/**
	 * Constructor
	 * @param top The BoardSquare where the top is located 
	 * @param foot The BoardSquare where the foot is located
	 */	
	
	Ladder(BoardSquare top, BoardSquare foot) {
		super(top, foot);
		setTop(top);
		foot.setMover(this);
	}
	/**
	 * Moves the player to the square determined by the constructor
	 * @param counter
	 */
	@Override
	void movePlayerPiece(PlayerPiece counter) {
		counter.setCurrentPosition(getTop());
		System.out.println("Player "+counter.getColor()+" goes up a ladder to "+getTop().getPosition());
		
	}

}
