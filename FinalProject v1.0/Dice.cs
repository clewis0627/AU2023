class Dice {
    public int[] Play(int[] diceWLT) {
        // Clear console on play game and display what game is being played
        Console.Clear();
        Console.WriteLine("You are playing the Dice Game!");

        // Declare and Initialize Variables
        int playerRoll;
        int computerRoll;
        bool playAgain = true;

        // Keeps track of this game's record
        int gameW = 0;
        int gameL = 0;
        int gameT = 0;

        while (playAgain) {
            // Declare Dice Options
            int[] die = new int[] {1, 2, 3, 4, 5, 6};

            // Initialize Random 
            Random rand = new Random();

            Console.WriteLine("The highest number wins! You are playing against the computer. \n");

            // Set Player and Computer Roll Outcomes
            playerRoll = die[rand.Next(0,5)];
            computerRoll = die[rand.Next(0,5)];

            // Display Player and Computer Roll Outcomes
            Console.WriteLine($"Your Roll: {playerRoll}");
            Console.WriteLine($"Computer Roll: {computerRoll}");

            // Logic for who wins game and record count
            if(playerRoll > computerRoll) {
                Console.WriteLine("You win! Your roll was higher than the computer's!");
                diceWLT[0]++;
                gameW++;
            }
            else if (computerRoll > playerRoll) {
                Console.WriteLine("You lose! Your roll was lower than the computer's!");
                diceWLT[1]++;
                gameL++;
            }
            else if (computerRoll == playerRoll) {
                Console.WriteLine("It's a tie! Your roll was the same as the computer's!");
                diceWLT[2]++;
                gameT++;
            }
            
            // Asks user if they want to play again
            playAgain = again();
        }

        // Thanks for playing
        Console.Clear();
        Console.WriteLine("Thanks for playing dice! \n ");
        Console.WriteLine($"Your record for this game was {gameW}W - {gameL}L - {gameT}T ");
        return diceWLT;
    }

    // Ask if user wants to play again
    bool again() {
        string input;
        bool validInput = false;
        bool playAgain = false;

        Console.WriteLine("Play again? y/n");
        
        while (!validInput) {    
            input = Console.ReadLine().ToLower();
            Console.WriteLine("\n");
            if (input == "yes" || input == "y" || input == "ye") {
                playAgain = true;
                validInput = true;
            }
            else if (input != "no" || input != "n") {
                playAgain = false;
                validInput = true;
            }
            else {
                Console.WriteLine("Invalid input! Please enter 'yes' or 'y' to play again, or choose 'no' or 'n' to end this game.");
                validInput = false;
            }
        }
        return playAgain;
    }
}