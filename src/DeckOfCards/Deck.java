package DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Template deck class. A deck contains 52 cards split into 4 suits of 13 numbers each. There should be a default constructor and a shuffle method.
 */
public class Deck {


	private ArrayList<Card> cards;
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	public Deck()
	{
		
		cards = new ArrayList<>();
		for (Suit suit: Suit.values())
		{
			for (int i = 1; i < 14; i++) //we do 1 to 14 so 1 = Ace, 2 = Two, etc. rather than 0 = Ace, 1 = Two
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
