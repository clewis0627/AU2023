package helloworld;

import java.util.Scanner;

/** 
 * @author CameronLewis
 * Purpose: School project for CIS 2151
 * Date: 01/20/2021
 */

public class Project0 {

    public static void main(String[] args) {

        // based off of code from https://github.com/EricCharnesky/CIS2151-Winter2021/blob/main/Project0/src/project0/Project0.java

        // Creates scanner item so we can start receiving user input
        Scanner keyboard = new Scanner(System.in);
        
        // Asks user question, then receives input from the "name" variable
        System.out.println("Lifeform detected. What is your name, unknown lifeform? ");
        String name = keyboard.nextLine();
        System.out.println("Hmmm... Interesting. \n");

        // System responds to user by name and asks another question
        // System responds to final question
        System.out.println("Hello " + name + "! What is your goal for this week?");
        String goal = keyboard.nextLine();
        System.out.println("That's excellent! My goal is to solve world peace. Good luck!");

    }

}