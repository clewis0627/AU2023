package project2;

/**
 *
 * @author Cameron Lewis
 */
public class Card implements Comparable<Card> {
    
    
    public enum Suit{ 
        CLUBS, SPADES, HEARTS, DIAMONDS
    };
    
    public enum Face {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
        NINE, TEN, JACK, QUEEN, KING, ACE
    };
    
    public Face face;
    public Suit suit;
    
    public Card(Suit suit, Face face) {
        this.face = face;
        this.suit = suit;
        
    }
    
    public Suit getSuit() {
        return suit;
    }
    public Face getFace() {
        return face;
    }
    
    
    
    @Override
    public int compareTo(Card o) {
        if (this.face == (o.face)) {
            return 0;
        }
        else if (this.face > o.face) {
            return 1;
        }
        else {
            return -1;
        }
    }
    
}
