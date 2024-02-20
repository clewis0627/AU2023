package project2;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class PokerHand {
    
    public PokerHand(ArrayList<Card> cards) {
        for (Card card : cards) {
            this.cards.add(new Card(card));
        }
        Collections.sort(this.cards);
    }

    enum Rank {
        HIGH_CARD, PAIR, TWO_PAIR, THREE_OF_A_KIND, STRAIGHT, FLUSH,
        FULL_HOUSE,FOUR_OF_A_KIND, STRAIGHT_FLUSH
    };
    
    enum Result {
        WIN, DRAW, LOSE
    };
    
    ArrayList<Card> cards;
    
    public Result call(PokerHand otherHand) {
        if (getHandRank().ordinal() > otherHand.getHandRank().ordinal()) {
            return Result.WIN;
        }
        if (getHandRank().ordinal() < otherHand.getHandRank().ordinal()) {
            return Result.LOSE;
        }
        
        // inset tie breaks
        
        return Result.LOSE;
    }
    public Rank getHandRank() {
        if (isStraightFlush() == true) {
            return Rank.STRAIGHT_FLUSH;
        }
        else if (isFourOfAKind() == true) {
            return Rank.FOUR_OF_A_KIND;
        }
        else if (ifFullHouse() == true) {
            return Rank.FULL_HOUSE;
        }
        else if (isFlush() == true) {
            return Rank.FLUSH;
        }
        else if (isStraight() == true) {
            return Rank.STRAIGHT;
        }
        else if (isThreeKind() == true) {
            return Rank.THREE_OF_A_KIND;
        }
        else if (isTwoPair() == true) {
            return Rank.TWO_PAIR;
        }
        else if (isOnePair() == true) {
            return Rank.PAIR;
        }
        else {
            return Rank.HIGH_CARD;
        }
    }
    
    // most from https://github.com/andyxhadji/Simple-Poker/blob/master/Game.java 
    // changed some variable names and used booleans instead of ints
    private boolean isStraightFlush() {
        for (int counter = 1; counter < 5; counter++) {
            if (hand[0].suit != hand[counter].suit) {
                return false;
            }
        }
        for (int counter2 = 1; counter2 < 5; counter2++) {
            if (hand[counter2 - 1].face != (hand[counter2].face - 1)) {
                return false;
            }
        }
        return true;
    }
    private boolean isFourOfAKind() {
        if (hand[0].face != hand[3].face && hand[1].face != hand[4].face) {
            return false;
        }
        else {
            return true;
        }
    }
    private boolean ifFullHouse() {
        int comparison = 0;
        for (int counter = 1; counter < 5; counter++) {
            if (hand[counter - 1].face == hand[counter].face) {
                comparison++;
            }
        }
        if (comparison == 3) {
            return true;
        }
        else {
            return false;
        }
    }
    private boolean isFlush() {
        for (int counter = 1; counter < 5; counter++) {
            if (hand[0].suit != hand[counter].suit)
            {
                return true;
            }
        }
        for (int counter2 = 1; counter2 < 5; counter2++) {
            if (hand[counter2 - 1].face != (hand[counter2].face - 1)) {
                return true;
            }
        }
        return false;
    }
    private boolean isStraight() {
        for (int counter2 = 1; counter2 < 5; counter2++) {
            if (hand[counter2 - 1].face != (hand[counter2].face - 1)) {
                return false;
            }		
        }
        return true;
    }
    private boolean isThreeKind() {
        if (hand[0].face == hand[2].face || hand[2].face == hand[4].face) {
            return true;
        }
        return false;
    }
    private boolean isTwoPair() {
        int check = 0;
        for(int counter = 1; counter < 5; counter++) {
            if (hand[counter - 1].face == hand[counter].face) {
                check++;
            }
        }
        if (check == 2) {
            return true;
        }
        else {
            return false;
        }
    }
    private boolean isOnePair() {
        int check = 0;
        for(int counter = 1; counter < 5; counter++) {
            if (hand[counter - 1].face == hand[counter].face) {
                check++;
            }
        }
        if (check == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    private boolean isHighCard() {
        int highCard = 0;
        for (int counter = 0; counter < 5; counter++) {
            if (hand[counter].rank > highCard) {
                highCard = hand[counter].rank;
            }
        }
        if (this.highCard > o.highCard) {
            return true;
        }
        else {
            return false;
        }
    }
}

