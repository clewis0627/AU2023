// Author: Cameron Lewis
// CIS 1500
// Program 1
// Purpose: to play word games with user

import java.util.Scanner; // Needed for user input

public class Project1
{
   public static void main(String [] args)
   {
      
      String name;         // Holds a name that the user input.
      int age;             // Holds an age that the user input.
      String city;         // Holds a city that the user input.
      String college;      // Holds a college that the user input.
      String job;          // Holds a job that the user input.
      String animal;       // Holds a animal that the user input.
      String petName;      // Holds a name of a pet that the user input.
      
      Scanner input = new Scanner(System.in);
      
      // Get the user's name
      System.out.println("What is your name?: ");
      name = input.nextLine();
      
      // Get the user's age
      System.out.println("What is your age? ");
      age = input.nextInt();
      
      // Throwing away to remove new line from buffer
      input.nextLine();
      
      // Get the user's city
      System.out.println("What city do you live in? ");
      city = input.nextLine();
      
      // Get the user's college
      System.out.println("What college do you go to? ");
      college = input.nextLine();
      
      // Get the user's profession
      System.out.println("What is your profession? ");
      job = input.nextLine();
      
      // Get the user's animal
      System.out.println("What is your favorite animal? ");
      animal = input.nextLine();
      
      // Get the user's pet's name
      System.out.println("What is your pet's name? ");
      petName = input.nextLine();
      
      // Prints the following story with the user's input
      System.out.println("\n\nThere once was a person named " + name + " who lived in " + city + ".");
      System.out.println("When " + name + " was " + age + ", they attended " + college + " and worked as a " + job + ".");
      System.out.println("If " + name + " could have any animal as a pet, they would have a " + animal + " named " + petName + ".");
      
   }
}