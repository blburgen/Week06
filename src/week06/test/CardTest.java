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

}
