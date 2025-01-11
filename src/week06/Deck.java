package week06;

import java.util.*;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	
	Deck () {
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
							"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
		for (String suit : suits) {
			int count = 2;
			for (String numberName : numbers) {
				cards.add(new Card(count, numberName + " of " + suit));				
				count++;
			}
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}		
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}

	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
}
