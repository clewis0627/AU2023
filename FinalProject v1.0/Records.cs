class Records {
    public void Menu(string name, int[] diceWLT, int[] tttWLT, int[] rpsWLT) {
        // Menu-Driven Records
        
        bool viewRecords = true;

        DateTime currentDateTime = DateTime.Now;
        // currentDateTime:yyyy-MM-dd HH:mm

        while (viewRecords) {
            // Display options for user to pick from the menu
            displayMenu();

            // Get user's choice for which menu item to pick
            int choice = getUserChoice();

            // Decides what to do based off of what the user picks
            switch (choice) {
                case 1:
                    Console.WriteLine("Dice Game Records\n");
                    diceRecord(name, diceWLT, currentDateTime);
                    break;

                case 2:
                    Console.WriteLine("Tic-Tac-Toe Records\n");
                    tttRecord(tttWLT, currentDateTime);
                    break;

                case 3:
                    Console.WriteLine("Rock, Paper, Scissors Records\n");
                    rpsRecord(name, rpsWLT, currentDateTime);
                    break;

                case 9:
                    Console.WriteLine("Exiting to Main Menu\n");
                    Menu mainMenu = new Menu();
                    mainMenu.DisplayMenu();
                    viewRecords = false;
                    break;
            
                default:
                    Console.WriteLine("\nInvalid choice. Please try again.");
                    Console.Write("Enter your choice: ");
                    break;
            }
        }
    }

    // Display Menu Options
    static void displayMenu() {
        Console.WriteLine("Welcome to the Records Menu!");
        Console.WriteLine("1. Dice Game Records");
        Console.WriteLine("2. Tic-Tac-Toe Game Records");
        Console.WriteLine("3. Rock, Paper, Scissors Game Records");
        Console.WriteLine("9. Return to Main Menu\n");
    }

    // Get user choice for which item to choose in the Records Menu
    private int getUserChoice() {
        Console.Write("Enter your choice: ");
        int choice;
        while (!int.TryParse(Console.ReadLine(), out choice)) {
            Console.WriteLine("Invalid input. Please enter a valid number.");
            Console.Write("Enter your choice: ");
        }
        return choice;
    }

    // Dice Record
    static void diceRecord(string name, int[] diceWLT, DateTime currentDateTime) {
        // Set File Path 
        string diceFilePath = "Dice_Stats.txt";

        // Import Dice Game Info
        try {
            using (StreamWriter writerDice = File.AppendText(diceFilePath)) {
                writerDice.WriteLine($"Game Record on {currentDateTime:yyyy-MM-dd HH:mm}");
                writerDice.WriteLine($"{name} Wins: {diceWLT[0]}");
                writerDice.WriteLine($"Computer Wins: {diceWLT[1]}");
                writerDice.WriteLine($"Draws: {diceWLT[2]}\n");
            
            Console.WriteLine("Report has been written to the file.");
            }
        } catch (Exception ex) {
            Console.WriteLine("An error occurred: " + ex.Message);
        }
    }

    // Tic-Tac-Toe Record
    static void tttRecord(int[] tttWLT, DateTime currentDateTime) {
        // Set File Path 
        string tttFilePath = "TTT_Stats.txt";

        // Import Tic-Tac-Toe Info
        try {
            using (StreamWriter writerTTT = File.AppendText(tttFilePath)) {
                writerTTT.WriteLine($"Game Record on {currentDateTime:yyyy-MM-dd HH:mm}");
                writerTTT.WriteLine($"Player X Wins: {tttWLT[0]}");
                writerTTT.WriteLine($"Player O Wins: {tttWLT[3]}");
                writerTTT.WriteLine($"Draws: {tttWLT[2]}\n");

                Console.WriteLine("Report has been written to the file.");
            }
        } catch (Exception ex) {
            Console.WriteLine("An error occurred: " + ex.Message);
        }
    }

    // Rock, Paper, Scissors Record
    static void rpsRecord(string name, int[] rpsWLT, DateTime currentDateTime) {
        // Set File Path 
        string rpsFilePath = "RPS_Stats.txt";

        // Import Rock, Paper, Scissors Info
        try {
            using (StreamWriter writerRPS = File.AppendText(rpsFilePath)) {
                writerRPS.WriteLine($"Game Record on {currentDateTime:yyyy-MM-dd HH:mm}");
                writerRPS.WriteLine($"{name} Wins: {rpsWLT[0]}");
                writerRPS.WriteLine($"Computer Wins: {rpsWLT[1]}");
                writerRPS.WriteLine($"Draws: {rpsWLT[2]}\n");
                
                Console.WriteLine("Report has been written to the file.");
            }
        } catch (Exception ex) {
            Console.WriteLine("An error occurred: " + ex.Message);
        }
    }
}