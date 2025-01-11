package week06;

import java.util.*;

public class App {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Deck deck = new Deck();
		String player1, player2, winner;
		
		System.out.println("     ----- Welcome to War -----     ");
		System.out.print("Please enter the name of player 1: ");
		player1 = sc.nextLine();
		System.out.print("Please enter the name of player 2: ");
		player2 = sc.nextLine();
		Player playerOne = new Player(player1);
		Player playerTwo = new Player(player2);
		deck.shuffle();
		for (int i = 0 ; i < 52 ; i++ ) {
			if (i % 2 == 0) {
				playerOne.draw(deck);
			}else {
				playerTwo.draw(deck);
			}
		}
		System.out.println("Hello " + player1 + " and " + player2 + "!  Are you ready to play War?");
		System.out.print("Press Enter/Return to continue");
		sc.nextLine();
		System.out.println("\n -----Lets get ready to battle!-----\n\n\n");
		
		for (int i = 0 ; i < 26 ; i++) {
			Card card1 = playerOne.flip();
			Card card2 = playerTwo.flip();
			if (card1.getValue() > card2.getValue()) {
				playerOne.incrementScore();
				winner = player1;
			} else if(card1.getValue() < card2.getValue()) {
				playerTwo.incrementScore();
				winner = player2;
			} else {
				winner = "Tie";
			}
			System.out.println(player1 + " has " + card1.getName());
			System.out.println(player2 + " has " + card2.getName());
			if (winner != "Tie") {
				System.out.println(winner + " has received a point.");
			} else { 
				System.out.println(winner + " - no points awarded.");
			};
			System.out.println("Scores: " + playerOne.getScore() + " // " + playerTwo.getScore());
			System.out.print("\nPress Enter/Return to continue - " + (26-1-i) + " round(s) to go.\n\n");
			sc.nextLine();
		}	
		playerOne.describe();
		playerTwo.describe();
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("\n" + player1 + " won the game.  Congratulations");
		} else if (playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("\n" + player2 + " won the game.  Congratulations");
		} else {
			System.out.println("\n It is a Draw. ");
		}
	}
}
