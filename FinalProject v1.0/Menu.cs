class Menu{
    public void DisplayMenu() {
        bool playGame = true;

        Console.WriteLine("Enter player name for this game session: ");
        string name = Console.ReadLine();
        Console.WriteLine($"Hello, {name}! Good luck on your games!\n");

        // Dice Win-Loss-Tie Record
        int diceW = 0;
        int diceT = 0;
        int diceL = 0;
        int[] diceWLT = new int[] {diceW, diceT, diceL};

        // Tic-Tac-Toe Team 1 Win-Loss-Tie Record
        int ttt1W = 0;
        int ttt1T = 0;
        int ttt1L = 0;
        // Tic-Tac-Toe Team 2 Win-Loss-Tie Record
        int ttt2W = 0;
        int ttt2T = 0;
        int ttt2L = 0;
        int[] tttWLT = new int[] {ttt1W, ttt1L, ttt1T, ttt2W, ttt2L, ttt2T};

        // Rock, Paper, Scissors Win-Loss-Tie Record
        int rpsW = 0;
        int rpsT = 0;
        int rpsL = 0;
        int[] rpsWLT = new int[] {rpsW, rpsT, rpsL};

        while (playGame) {
            // Shows Menu Options
            showOptions();

            // Get User choice for which option to enter for the game
            int choice = getUserChoice();

            switch (choice) {
                // Dice Game
                case 1:
                    Dice game1 = new Dice();
                    diceWLT = game1.Play(diceWLT);
                    break;
                
                // Tic-Tac-Toe Game
                case 2:
                    TTT game2 = new TTT();
                    tttWLT = game2.Play(tttWLT);
                    break;

                // Rock, Paper, Scissors Game
                case 3:
                    RPS game3 = new RPS();
                    rpsWLT = game3.Play(rpsWLT);
                    break;

                // Records Menu
                case 4:
                    Records records = new Records();
                    records.Menu(name, diceWLT, tttWLT, rpsWLT); 
                    break;

                // Exit Game
                case 9:
                    Console.WriteLine($"\nThanks for playing, {name}! ");
                    int[] sessionRecord = getSessionRecord(diceWLT, tttWLT, rpsWLT);
                    //Console.WriteLine($"Your overall record this session was {sessionRecord[0]}W - {sessionRecord[1]}L - {sessionRecord[2]}T \n");
                    playGame = false;
                    break;

                // Enter a valid input
                default:
                    Console.WriteLine("Invalid choice. Please try again.");
                    break;
            }
        }
        Environment.Exit(0);
    }

    // Display Menu Options
    public void showOptions() {
        Console.WriteLine("Welcome to the Game Menu!");
        Console.WriteLine("1. Play Dice Game! (versus Computer)");
        Console.WriteLine("2. Play Tic-TacToe! (Player versus Player)");
        Console.WriteLine("3. Play Rock, Paper, Scissors! (versus Computer)");
        Console.WriteLine("4. View Player Records (Will reset player stats from this session) ");
        Console.WriteLine("9. Exit\n");
    }

    // Gets user choice for which option to enter on the menu
    private int getUserChoice() {
        Console.Write("Enter your choice: ");
        int choice;
        
        while (!int.TryParse(Console.ReadLine(), out choice)) {
            Console.WriteLine("Invalid input. Please enter a valid number.");
            Console.Write("Enter your choice: ");
        } 
        return choice;
    }

    public int[] getSessionRecord(int[] diceWLT, int[] tttWLT, int[] rpsWLT) {
        int sessionW = diceWLT[0] + tttWLT[0] + tttWLT[3] + rpsWLT[0];
        int sessionL = diceWLT[1] + tttWLT[1] + tttWLT[4] + rpsWLT[1];
        int sessionT = diceWLT[2] + tttWLT[2] + tttWLT[5] + rpsWLT[2];

        int[] sessionRecord = new int[] { sessionW, sessionL, sessionT };

        return sessionRecord;
    }
}