package DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	/**
	 * Template deck class. A deck contains 52 cards split into 4 suits of 13 numbers each. There should be a default constructor and a shuffle method.
	 */

	private ArrayList<Card> cards;
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	public Deck()
	{
		
		cards = new ArrayList<>();
		for (Suit suit: Suit.values())
		{
			for (int i = 0; i < 13; i++)
			{
				Card c = new Card(suit, i);
				cards.add(c);
			}
		}
	}
	
	/**
	 * Shuffle method to randomise the deck. Using Collections.shuffle as there was no rule against it on the assignment
	 * However, a new implementation is easy to make here should we decide to use another algorithm - just replace what's in here. 
	 */
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
	
}
