package gameSnakeAndLadder;

public abstract class Mover {
	Mover(BoardSquare first, BoardSquare second) {
	}
	/**
	 * Moves the player to the square determined by the constructor
	 * @param counter
	 */
	abstract void movePlayerPiece(PlayerPiece counter);
}
