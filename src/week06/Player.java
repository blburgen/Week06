package week06;

import java.util.*;

public class Player {
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	Player(String name){
		this.score = 0;
		this.name = name;
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Player: " + name + " score: " + score);
		for (Card card : this.hand) {
			card.describe();
		}		
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
}
