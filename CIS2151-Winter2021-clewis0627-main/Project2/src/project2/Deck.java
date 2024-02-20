package project2;

import java.util.Random;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;
    
    
    public Deck() {
        Random randomGenerator = new Random();
          
        cards = new ArrayList<>();
    
        ArrayList<Card> deck = new ArrayList<>();
        for (Card.Face faceValue : Card.Face.values()) {
            for (Card.Suit suitValue : Card.Suit.values()) {
                deck.add(new Card(suitValue, faceValue));
            }
        }
    }
}
