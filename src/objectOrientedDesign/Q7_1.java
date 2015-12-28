package objectOrientedDesign;

public class Q7_1 {

}

class Card{
	public enum Suit{
		CLUBS(1), HEARTS(2), DIAMONDS(3), SPADES(4);
		int value;
		private Suit(int v){
			value = v;
		}
	};
	private int card;
	private Suit suit;
	
	public Card(int card, Suit suit){
		this.card = card;
		this.suit = suit;
	}
}
