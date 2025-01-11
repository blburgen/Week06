package week06;

public class Card {
	
	private int value;
	private String name;
	
	public Card(int value, String name) {
		// makes sure the value is between 2 and 14
		if (value >= 2 && value <= 14) {  
			this.value = value;
		} else {
			this.value = 2;
			System.out.println("Values not set. Pleases set value between 2 and 14.");
		};
		// makes sure the name is greater than 2 characters
		if (name != null && name.length() > 2) { 
			this.name = name;
		} else {
			System.out.println("Name not set.");
		};
		
	}
	// gets and returns the value of the card
	public int getValue() {
		return value;
	}
	// sets the value of the card
	public void setValue(int value) {
		// makes sure the value of the card is between 2 and 14.
		if (value >= 2 && value <= 14) {
			this.value = value;
		} else {
			System.out.println("Invalid value - original value remains");
		};
	}
	// gets and returns the name of the card
	public String getName() {
		return name;
	}
	// sets the name of the card
	public void setName(String name) {
		// makes sure the card name is greater than 2 characters
		if (name != null && name.length() > 2) {
			this.name = name;
		} else {
			System.out.println("Invalid name -- original name remains.");
		};
	}
	// prints out the description of the card
	public void describe() {
		System.out.println(name + ": " + value + " points");
	}
}
