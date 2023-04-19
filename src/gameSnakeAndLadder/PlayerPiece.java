package gameSnakeAndLadder;

class PlayerPiece {
	/*
	 * The color of the player
	 */
	private String color;
	
	private BoardSquare currentPosition;
	/**
	 * Setter of color
	 * @param color
	 */
	void setColor(String color) {
		this.color = color;
	}
	/**
	 * Setter of current position
	 * @param square
	 */
	void setCurrentPosition(BoardSquare square) {
		this.currentPosition = square;
	}
	/**
	 * Getter
	 * @return The current position
	 */
	BoardSquare getCurrentPosition() {
		return currentPosition;
	}
	
	String getColor() {
		return color;
	}
	/**
	 * Moves the player piece to square
	 * @param square
	 */
	void setNewPosition(BoardSquare square) {
		square.movePlayerPiece(this);
	}
	
	PlayerPiece(String color){
		setColor(color);
	}
}
