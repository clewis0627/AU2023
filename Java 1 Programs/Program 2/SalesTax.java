// Author: Cameron Lewis
// CIS 1500
// Program 2
// Due: 22 October 2020

import java.util.Scanner; // Needed for user input

public class SalesTax {
/* The purpose of this program is to calculate 6% and 7% 
   of the user's taxable income and show the difference 
   under the State's proposed 7% income tax bill */

   public static void main(String [] args) {
   
      // Holds the income that the user input
      double income;
      
      // Holds the taxable percent of the user's inputted income 
      double taxPercent;
      
      // Variable used for user input
      Scanner input = new Scanner(System.in); 
      
      // Prints the statement within the quotes
      System.out.print("Proposed Sales Tax Increase Program\n");
      
      // Gets the user's income
      System.out.print("What is your current income: ");
      income = input.nextDouble();
      
      // Gets the percentage of income that is taxable from the user
      System.out.print("What percent of your income is taxable (0 to 100): ");
      taxPercent = input.nextDouble();
      
      // Calculates taxable income based on values the user input for income and taxable percent
      double taxableIncome = income * (taxPercent / 100);
      System.out.printf("Taxable income: $%,.02f\n", taxableIncome);
      
      // Calculates six percent of the taxable income the user input
      double sixPercent = taxableIncome * .06;
      System.out.printf("At current 6%% tax: $%,.02f\n", sixPercent);
      
      /* Calculates seven percent of the taxable income the user input */
      double sevenPercent = taxableIncome * .07;
      System.out.printf("At proposed 7%% tax: $%,.02f\n", sevenPercent);
      
      // Calculates the difference the user would be saving if the proposed seven percent tax went into effect
      double difference = sevenPercent - sixPercent;
      System.out.printf("Difference: $%,.02f", difference);
   }
}