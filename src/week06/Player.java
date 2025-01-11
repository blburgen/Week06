package week06;

import java.util.*;

public class Player {
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	// initiates a player with a name and a initial score
	Player(String name){
		this.score = 0;
		this.name = name;
	}
	//gets and returns the players hand
	public List<Card> getHand() {
		return hand;
	}
	//sets the players hand
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	//gets and returns the players score
	public int getScore() {
		return this.score;
	}
	//sets the players score
	public void setScore(int score) {
		this.score = score;
	}
	//gets and returns the player's name
	public String getName() {
		return this.name;
	}
	//sets the player's name
	public void setName(String name) {
		this.name = name;
	}
	//describes the player and any cards that they have in their hand
	public void describe() {
		System.out.println("Player: " + name + " score: " + score);
		for (Card card : this.hand) {
			card.describe();
		}		
	}
	//removes the top card from the player's hand and returns it
	public Card flip() {
		return hand.remove(0);
	}
	//adds a card to the player's had from the card deck
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	//increases the players score
	public void incrementScore() {
		score++;
	}
}
