/*
 * Cameron Lewis
 * CIS2151
 * Eric Charnesky
 * Project 2
 */
package project2;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Project2 {

    Deck deck = new Deck();
    Scanner scan = new Scanner(System.in);
    boolean again = true;
    Card[] hand;
    

    
    double money = 5;
    double cpuMoney = 5;
    
    public void PlayGame() {
        while (again == true) {
            System.out.println("Welcome to Poker. Your hand is: \n");
            
            PokerHand.call(PokerHand, otherHand0);
            PokerHand.getHandRank();
            
            
            if (money > 0 ) {
                System.out.println("Would you like to play again? [ y / n ] ");
                String answer = again.nextString();
                if (answer.equalsIgnoreCase == y) {
                    again = true;
                }
                else {
                    again = false;
                    break;
                }
            }
            else {
                System.out.println("You are out of money! Thanks for playing.");
                again == false;
                break;
            }
        }
    }
    // https://github.com/andyxhadji/Simple-Poker/blob/master/Game.java
    public void drawHand(){
        hand[0].face = 1;
        hand[1].face = 2;
        hand[2].face = 3;
        hand[3].face = 4;
        hand[4].face = 5;

        hand[0].suit = 1;
        hand[1].suit = 1;
        hand[2].suit = 1;
        hand[3].suit = 1;
        hand[4].suit = 1;
    }
    
    
    // will start earlier next time...
    // apologies for poor effort
}
