class RPS {
    public int[] Play(int[] rpsWLT) {
        // Clear console on game play and display what game is being played
        Console.Clear();
        Console.WriteLine("You are playing Rock, Paper, Scissors!");

        // Initialize Variables
        string player;
        string computer;
        bool playAgain = true;
        string input;

        // Declare possible options
        string[] options = new string[] {"rock", "paper", "scissors"};

        // Keeps track of this game's record
        int gameW = 0;
        int gameL = 0;
        int gameT = 0;
        
        while (playAgain == true) {
            // Initialize Random
            Random rand = new Random();

            // Display rules
            Console.WriteLine("Paper beats Rock!");
            Console.WriteLine("Rock beats Scissors!");
            Console.WriteLine("Scissors beats Paper!\n");

            // Player pick
            Console.WriteLine("What's your move? ");
            player = Console.ReadLine().ToLower();

            while (player != options[0] && player != options[1] && player != options[2]) {
                Console.WriteLine("Invalid input! Please enter 'rock' or 'paper' or 'scissors' ");
                player = Console.ReadLine().ToLower();
            }

            // Computer pick
            computer = options[rand.Next(0,2)];

            Console.WriteLine($"You played: {player}");
            Console.WriteLine($"Computer played: {computer}\n");

            // Win Logic
            if (player == "paper" && computer == "rock") {
                Console.WriteLine("Paper beats rock!");
                Console.WriteLine("You win this round.\n");
                rpsWLT[0]++;
                gameW++;
            }
            if (player == "rock" && computer == "scissors") {
                Console.WriteLine("Rock beats scissors!");
                Console.WriteLine("You win this round.\n");
                rpsWLT[0]++;
                gameW++;
            }
            if (player == "scissors" && computer == "paper") {
                Console.WriteLine("Scissors beats paper!");
                Console.WriteLine("You win this round.\n");
                rpsWLT[0]++;
                gameW++;
            }

            // Lose Logic
            if (computer == "paper" && player == "rock") {
                Console.WriteLine("Paper beats rock!");
                Console.WriteLine("You lost this round.\n");
                rpsWLT[1]++;
                gameL++;
            }
            if (computer == "rock" && player == "scissors") {
                Console.WriteLine("Rock beats scissors!");
                Console.WriteLine("You lost this round.\n");
                rpsWLT[1]++;
                gameL++;
            }
            if (computer == "scissors" && player == "paper") {
                Console.WriteLine("Scissors beats paper!");
                Console.WriteLine("You lost this round.\n");
                rpsWLT[1]++;
                gameL++;
            }

            // Tie Logic
            if (computer == player) {
                Console.WriteLine("It's a tie!\n");
                rpsWLT[2]++;
                gameT++;
            }

            // Asks user if they want to play again
            playAgain = again();
        }

        // Thanks for playing
        Console.Clear();
        Console.WriteLine("Thanks for playing Rock, Paper, Scissors! \n ");
        Console.WriteLine($"Your record for this game session was {gameW}W - {gameL}L - {gameT}T ");
        Console.WriteLine($"Your overall record for Rock, Paper, Scissors is {rpsWLT[0]}W - {rpsWLT[1]}L - {rpsWLT[2]}T \n");
        
        return rpsWLT;
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