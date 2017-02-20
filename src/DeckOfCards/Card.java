package DeckOfCards;

/**
 * Representation of a card. 1 to 13 (J, Q, K), 4 suits on each card, represented as an enum.
 * Overriden equals and hashcode for our ad-hoc test harness, however these are not really needed and can be removed
 *
 */
public class Card {
	
	private final Suit suit;
	private final int number;
	
	public Card(Suit suit, int number)
	{
		this.suit = suit;
		this.number = number;
		
	}

	public Suit getSuit() {
		return suit;
	}

	public int getNumber() {
		return number;
	}

	//Not really needed as we're not using any hashing. However let's do it so we don't break the contract.
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (number != other.number)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
	
	


}
