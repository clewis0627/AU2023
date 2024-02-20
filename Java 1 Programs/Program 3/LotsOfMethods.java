/*

Copy this class and paste it in to your development environment (e.g., jGRASP).  
Leave the main method EXACTLY as it is -- do not change a line of main. 
Write the many missing methods.

Write the methods so that the methods will work for ANY reasonable input values
and NOT JUST FOR THE EXACT values sent in the main method below.

Use good, descriptive variable names inside your methods.

*/

public class LotsOfMethods
{
	public static void main(String [] args)
	{
		// Sample method getting called.  Just reports the String sent to the method
		// by printing "Received: " followed by the String.
		
		sampleMethod("hello");
		sampleMethod("there");
		
		// For the received integer value, report whether or not it is odd.
		// It should work for any integer value (not just those used below).
		// It reports a message of the format "16 is not odd" or "1 is odd".
		
		reportOdd(3);
		reportOdd(100);
		reportOdd(77);
		
		// Assume that the two values represent the width and height of
		// a rectangle.  Report the area of the rectangle with a line of 
		// the form "Area is 100.0 for a rectangle of width 10.0 and height 10.0".
		// Print one digit after the decimal point.
	
		printArea(10.00, 10.0);
		printArea(3.555, 19.4);
		printArea(600.5, 1.1);
		
		// Assume that the values sent to stockSale are a String representing
		// the name of the company, an integer representing the number of shares
		// of the stock that were sold, and the price the stock was sold at.
		// Report the information about the sale in a line of output of this 
		// format:
		//
		//       Sold 50 shares of IBM at $35.50 for $1,775.00
		// 
		
		stockSale("IBM", 50, 35.5);
		stockSale("Apple", 100, 440.25);
		stockSale("GM", 25, 12.75);
		
		// Write the method determineTax.  The method is sent the amount of the
		// purchase and the tax rate.  It returns a double value that is the 
		// amount of the tax.
		// Note that the method determineTax does not print anything -- it 
		// just returns the value.
	   
		double m1 = determineTax(350.00, 0.06);  // Michigan is 6%
		double m2 = determineTax(79.99, 0.06);
		
		double cal1 = determineTax(499.99, 0.0725);  // California is 7.25%
		
		System.out.printf("Here are the returned values: %.2f, %.2f, and %.2f\n", m1, m2, cal1);
		
		// Reports the grade that corresponds to the test score supplied, according to this scale:
		// A: 100-90, B: 89-80, C: 79-70, D: 69-60, E: 59-0.  Report "Invalid" for any other score.
		// Invalid scores should be reported like this: "110 is an invalid score". 
		// Valid scores should be reported like this: "70 has a grade of C".
		
		testScore(93);
		testScore(70);
		testScore(110);
		testScore(-3);
		testScore(52);
		testScore(88);
		
		// In the gambling game of craps the gambler rolls two dice.  The first roll of the dice 
		// has several different outcomes.  If a 2, 3, or 12 is rolled then the gambler "craps out" (i.e, 
		// they lose).  If they roll a 7 or 11 then they "win".  If they roll any other number then
		// they "keep rolling". 
		// Write a method that takes the two dice and reports one of the three possible outcomes:
		//   * "crap out"
		//   * "win"
		//   * "keep rolling"
		//
		// This method just reports the status of just the first roll.
		
		firstRoll(2, 3);
		firstRoll(6, 1);
		firstRoll(4, 5);
		firstRoll(4, 3);
		firstRoll(6, 6);
		
		// Write a method waterState that takes a single double value as a parameter that indicates the 
		// temperature of the water.  Your method will return a single String indicating the state of water
		// at that temperature.  The three possible states are "solid", "liquid", or "gas". I.e., water is 
		// solid, as ice, at 32 degrees or less, it is a gas (steam) at 212 degrees and above, and it is a 
		// liquid between 32 and 212.
		
		String w1 = waterState(76.5);  // 76 degrees -- liquid water
		System.out.println("w1 is: " + w1);
		
		String w2 = waterState(17.7);
		System.out.println("For 17 it is: " + w2);
		
		String w3 = waterState(32.0);
		System.out.println("Right at 32 is is frozen: " + w3);
		
		System.out.println("Hot: " + waterState(250.0));
		
		// Write a method that returns a boolean value of true or false.
	   // It takes three test scores, and return true or false to indicate
		// if the average grade is a passing grade (i.e., return true if the average is
		// 70.0 points or more).
		
		boolean b = passes(99.0, 83.0, 90.2);
		System.out.println("b is: " + b);
		
		boolean b2 = passes(72.0, 54.5, 69.5);
		System.out.println("return value of: " + b2);
		
		System.out.println( passes(100.0, 5.0, 82.0) );
		
		// Write a method that uses a loop to print the squares of numbers.
		// The squares are reported in increments of one from the first 
		// number to the second number, inclusive:
		
		squares(2, 9);
		squares(100, 105);
		squares(22, 30); 
	}
	
	
	// ********* YOU SHOULD WRITE THE OTHER METHODS HERE ********* 
	
   // example provided by prof mehta
   // prints statement followed by string parameter 
	static void sampleMethod(String s)
	{
		System.out.println("Received: " + s);
	}
   
   // if the number is divisible by two then the system prints the number followed by "is not odd." 
   // otherwise the system prints "is odd" after the number
   static void reportOdd(int num) {
      if (num % 2 == 0){
         System.out.println(num + " is not odd");
      } 
      else {
         System.out.println(num + " is odd");
      }
   }
   
   // the variable areaRect calculates the area
   // then the system prints the statement formatted to 1 decimal place with input from the parameters and variable
   static void printArea(double width, double length) {
      double areaRect = width * length;
      System.out.printf("Area is %.1f for a rectangle of width %.1f and height %.1f.\n", areaRect, width, length);
   }
   
   // the variable stockPrice calculates the total cost being bought
   // then the system prints the statement formatted to two decimal places (for cents) with input from the parameters and variable
   static void stockSale(String company, int shares, double price) {
      double stockPrice = shares * price;
      System.out.printf("Sold %d shares of %s at %,.2f for $%,.2f.\n", shares, company, price, stockPrice);
   } 
   
   // multiplies the total and state tax and returns the answer
   static double determineTax(double total1, double stateTax) {
      return total1 * stateTax;
   } 
   
   // if else statement and goes down the list until the value fits in a certain letter grade
   // once value fits a statement then system prints the number and letter grade
   static void testScore(double score) {
      if (score > 100) {
         System.out.println(score + " is an invalid score");
      } else if (score < 0) {
         System.out.println(score + " is an invalid score");
      } else if (score >= 90) {
         System.out.println(score + " has a grade of A");
      } else if (score >= 80) {
         System.out.println(score + " has a grade of B");
      } else if (score >= 70) {
         System.out.println(score + " has a grade of C");
      } else if (score >= 60) {
         System.out.println(score + " has a grade of D");
      } else if (score > 60) {
         System.out.println(score + " has a grade of E");
      }
   }
   
   // the crapsNum variable adds the two dice together for the game
   // the if else statement takes crapsNum into account when finding which statement fits
   // "||" stands for "or"
   // 2, 3, or 12 prints "crap out"
   // 7 or 11 prints "win!"
   // anything else prints "keep rolling"
   static void firstRoll(int dice1, int dice2) {
      int crapsNum = dice1 + dice2;
      if(crapsNum == 2 || crapsNum == 3 || crapsNum == 12) {
         System.out.println(dice1 + " and " + dice2 + ": crap out");
      } else if (crapsNum == 7 || crapsNum == 11) {
         System.out.println(dice1 + " and " + dice2 + ": win!");
      } else {
         System.out.println(dice1 + " and " + dice2 + ": keep rolling");
      }
   }
   
   // takes parameter and determines the correct statement
   // returns "gas" if water is >= 212
   // returns "solid" if water is <= 32
   // returns "liquid" if any other value
   static String waterState(double temp) {
      if (temp >= 212) {
         return "gas";
      } else if (temp <= 32) {
         return "solid";
      } else {
         return "liquid";
      }
   }
   
   // passGrade variable averages the three tests
   // if passGrade avg is >=70 then system returns true
   // if avg is < 70 then system returns false
   static boolean passes(double test1, double test2, double test3) {
      double passGrade = (test1 + test2 + test3) / 3;
      if (passGrade >= 70) {
         return true;
      } else {
         return false;
      }
   }
   
   // for statement sets n variable as the first parameter
   // after every loop the n variable adds one to it 
   // loop stops when n > the second parameter
   // in loop nSquare variable multiplies n by itself for the square
   // during loop, prints n variable "squared: " and the square of n
	static void squares(int firstNum, int secondNum) {
    for (int n = firstNum; n < secondNum; n++) {
      int nSquare = n * n;
      System.out.println(n + " squared: " + nSquare);
    } 
   } 
}
