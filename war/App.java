package war;

public class App {

	public static void main(String[] args) {
	Deck deck = new Deck();
	deck.shuffle();
	
	Player player1 = new Player("1");
	Player player2 = new Player("2");
	

	for (int i = 0; i < 52; i++ ) {
		if ( i % 2 == 0) {
			player1.draw(deck);
			}
		else {
			player2.draw(deck);
			}
		} //end of for loop
	
	for (int i = 0; i < 26; i++ ) {
		System.out.println();
		System.out.println("************** Draw " + (i + 1) + " ****************");
		Card player1Card = player1.flip();
		Card player2Card = player2.flip();
		if (player1Card.getValue() > player2Card.getValue()) {
			System.out.println("Player 1 won, their card: ");
	        player1Card.describe();
	        System.out.println("VS");
	        System.out.println("Player 2's card:");
	        player2Card.describe();
	        player1.incrementScore();
		}
		else if (player1Card.getValue() < player2Card.getValue()) {
			System.out.println("Player 2 won, their card: ");
	        player2Card.describe();
	        System.out.println("VS");
	        System.out.println("Player 1's card:");
	        player1Card.describe();
	        player2.incrementScore();
		}
		else if (player1Card.getValue() == player2Card.getValue()) {
			System.out.println("DRAW");
		}   
		System.out.println();
	}//end of for loop
	
	System.out.println("************ FINAL SCORE **************");
	System.out.println("Player 1 FINAL SCORE = " + player1.getScore());
	System.out.println("Player 2 FINAL SCORE = " + player2.getScore());

	if (player1.getScore() > player2.getScore()) {
		System.out.println("Player 1 WINS");
	}
	else if (player1.getScore() < player2.getScore()) {
		System.out.println("Player 2 WINS");
	}
	else {
		System.out.println("DRAW");
	}// end "if"
	
	}//end Main
}//end Class
