package week06.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import week06.Card;

class CardTest {

	@Test
	void testInitiateCard() {
		Card card = new Card(14, "Ace of Hearts");
		int value = card.getValue();
		String name = card.getName();
		assertEquals(14, value);
		assertEquals("Ace of Hearts", name);
	}
	
	@Test
	void testInitiateCardBadValue() {
		Card card = new Card(15, "Ace of Hearts");
		int value = card.getValue();
		String name = card.getName();
		assertEquals(2, value);
		assertEquals("Ace of Hearts", name);
	}
	
	@Test
	void testInitiateCardBadName() {
		Card card = new Card(5, "Of");
		int value = card.getValue();
		String name = card.getName();
		assertEquals(5, value);
		assertEquals(null, name);
	}
	
	@Test
	void testSetValueZero() {
		Card card = new Card(14, "Ace of Hearts");
		card.setValue(0);
		int value = card.getValue();
		String name = card.getName();
		assertEquals(14, value);
		assertEquals("Ace of Hearts", name);
	}
	
	@Test
	void testSetValueToHigh() {
		Card card = new Card(14, "Ace of Hearts");
		card.setValue(15);
		int value = card.getValue();
		String name = card.getName();
		assertEquals(14, value);
		assertEquals("Ace of Hearts", name);
	}
	
	@Test
	void testSetValue() {
		Card card = new Card(14, "Ace of Hearts");
		card.setValue(2);
		int value = card.getValue();
		String name = card.getName();
		assertEquals(2, value);
		assertEquals("Ace of Hearts", name);
	}

	@Test
	void testSetName() {
		Card card = new Card(5, "Ace of Hearts");
		card.setName("King of Clubs");
		int value = card.getValue();
		String name = card.getName();
		assertEquals(5, value);
		assertEquals("King of Clubs", name);
	}
	
	@Test
	void testSetNameToShort() {
		Card card = new Card(5, "Ace of Hearts");
		card.setName("");
		int value = card.getValue();
		String name = card.getName();
		assertEquals(5, value);
		assertEquals("Ace of Hearts", name);
	}
	
	@Test
	void testSetNameToNull() {
		Card card = new Card(5, "Ace of Hearts");
		card.setName(null);
		int value = card.getValue();
		String name = card.getName();
		assertEquals(5, value);
		assertEquals("Ace of Hearts", name);
	}
	
	@Test
	void testSetNameToTwoShort() {
		Card card = new Card(5, "Ace of Hearts");
		card.setName("2");
		int value = card.getValue();
		String name = card.getName();
		assertEquals(5, value);
		assertEquals("Ace of Hearts", name);
	}
}
