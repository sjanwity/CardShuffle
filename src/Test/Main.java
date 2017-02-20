package Test;

import DeckOfCards.Card;
import DeckOfCards.Deck;
import DeckOfCards.Suit;

/**
 * Main class which also serves as testing harness. Did not use JUnit or other testing frameworks as scope of the project does not justify it.
 * But defined in a seperate package so transfer to a proper testing harness is simple.
 *
 */
public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		testDuration(deck);
		testCardLocation(deck, new Card(Suit.SPADE, 1), 10); //ace of spades

		
	}
	/**
	 * Test how long it takes to do 1,000,000 shuffles
	 *
	 */
	static void testDuration(Deck deck)
	{
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
		{
			deck.shuffle();
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		
		System.out.println("Time spent for 1,000,000 shuffles: " + duration +"ms");
		
	}
	
	/**
	 * Test the location of any card after any number of shuffles, printing after each shuffle.
	 * @param deck
	 * @param card
	 */
	static void testCardLocation(Deck deck, Card card, int shuffles)
	{
		for (int i = 0; i < shuffles; i++)
		{
			deck.shuffle();
			System.out.println("After " + i + " shuffles, the card is located at " + deck.getCards().indexOf(card));
		}
	}

}
