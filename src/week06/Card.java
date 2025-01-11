package week06;

public class Card {
	
	private int value;
	private String name;
	
	public Card(int value, String name) {
		if (value >= 2 && value <= 14) {
			this.value = value;
		} else {
			this.value = 2;
			System.out.println("Values not set. Pleases set value between 2 and 14.");
		};
		if (name != null && name.length() > 2) {
			this.name = name;
		} else {
			System.out.println("Name not set.");
		};
		
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		if (value >= 2 && value <= 14) {
			this.value = value;
		} else {
			System.out.println("Invalid value - original value remains");
		};
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		if (name != null && name.length() > 2) {
			this.name = name;
		} else {
			System.out.println("Invalid name -- original name remains.");
		};
	}
	
	public void describe() {
		System.out.println(name + ": " + value + " points");
	}
}
