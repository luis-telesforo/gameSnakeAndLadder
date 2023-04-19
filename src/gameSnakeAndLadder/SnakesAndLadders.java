package gameSnakeAndLadder;

public class SnakesAndLadders {
	//needs a game board
	public GameBoard board;
	/**
	 * Constructor
	 */
	public SnakesAndLadders() {
		board = new GameBoard();
		
	}
	/**
	 * Simulates a game
	 */
	public void play() {
		PlayerPiece counter1 = new PlayerPiece("Red");
		PlayerPiece counter2 = new PlayerPiece("Blue");
		counter1.setCurrentPosition(board.getStartSquare());
		counter2.setCurrentPosition(board.getStartSquare());
		
		//Turns
		while(true) {
			board.movePlayerPiece(counter1);
			if (counter1.getCurrentPosition().getPosition()==GameBoard.MAX_SQUARES) {
				System.out.println("Player "+counter1.getColor()+" wins.");
				break;
			}
			else {
				System.out.println("Player "+counter1.getColor()+" is on "+counter1.getCurrentPosition().getPosition());
			}
			
			board.movePlayerPiece(counter2);
			if (counter2.getCurrentPosition().getPosition()==GameBoard.MAX_SQUARES) {
				System.out.println("Player "+counter2.getColor()+" wins.");
				break;
			}
			else {
				System.out.println("Player "+counter2.getColor()+" is on "+counter2.getCurrentPosition().getPosition());
			}
			
		}
		System.out.println("End of the game.");
	}
	/**
	 * It creates a game and plays
	 * @param args
	 */
	public static void main(String[] args) { 
		SnakesAndLadders myGame = new SnakesAndLadders();
		myGame.play();
	}

}
