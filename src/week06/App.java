package week06;

import java.util.*;

public class App {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Deck deck = new Deck();
		String player1, player2, winner;
		
		System.out.println("     ----- Welcome to War -----     ");
		//Enters the first player's name
		System.out.print("Please enter the name of player 1: ");
		player1 = sc.nextLine();
		//Enters the second player's name
		System.out.print("Please enter the name of player 2: ");
		player2 = sc.nextLine();
		//Creates the two player objects
		Player playerOne = new Player(player1);
		Player playerTwo = new Player(player2);
		//shuffles the deck before dealing it out
		deck.shuffle();
		//deals out the deck to the two players
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
		//runs through the game of war
		for (int i = 0 ; i < 26 ; i++) {
			//gets the top card from each player's deck
			Card card1 = playerOne.flip();
			Card card2 = playerTwo.flip();
			//compares each players card and determines the winner of the round
			if (card1.getValue() > card2.getValue()) {
				playerOne.incrementScore();
				winner = player1;
			} else if(card1.getValue() < card2.getValue()) {
				playerTwo.incrementScore();
				winner = player2;
			} else {
				winner = "Tie";
			}
			//outputs the result of the round
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
		//tells the players the final scores
		playerOne.describe();
		playerTwo.describe();
		//tells the players who won
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("\n" + player1 + " won the game.  Congratulations");
		} else if (playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("\n" + player2 + " won the game.  Congratulations");
		} else {
			System.out.println("\n It is a Draw. ");
		}
	}
}
