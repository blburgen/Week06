package week06;

import java.util.*;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	//Initiates the deck with 52 cards.  Each card has a name and a value set to them
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
	//gets and returns the card deck
	public List<Card> getCards() {
		return cards;
	}
	//sets the card deck
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	//prints out each of the cards in the card deck
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}		
	}
	//shuffles the card deck
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	//removes and returns the top card in the card deck
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
}
