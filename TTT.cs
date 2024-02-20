class TTT {
    public int[] Play(int[] tttWLT) {
        // Clear console on game play and display what game is being played
        Console.Clear();
        Console.WriteLine("You are playing Tic-Tac-Toe!");

        // Declare and Initialize Variables
        bool playAgain = true;
        int rows = 3;
        int cols = 3;
        int indexR;
        int indexC;
        int winX = 0;
        int winO = 0;
        string turn = "x";
        int winNum;

        // Stats for total game play
        // Team 1 Stats (Team X)
        int t1W = 0;
        int t1L = 0;
        int t1T = 0;
        // Team 2 Stats (Team O)
        int t2W = 0;
        int t2L = 0;
        int t2T = 0;
        
        // Initialize Board
        string[,] board = initBoard(rows, cols);

        // Prints board
        printBoard(board);

        // Playing X’s/O’s AKA Game
        while (playAgain) {    
            while (winX == 0 && winO == 0) {
                // Enter Rows + Cols for X
                // Loops through while it is Player X's turn
                // Loops so that it can do it again if an invalid input is given
                while (turn.ToLower() == "x") {
                    // Get player row input
                    Console.WriteLine("Enter row location for player X: ");
                    // Error Checking to ensure only the accepted values are entered.
                    string playerRX_str = Console.ReadLine();
                    while (playerRX_str != "1" && playerRX_str != "2" && playerRX_str != "3") {
                        Console.WriteLine("Invalid Input! Please enter 1, 2, or 3.");
                        playerRX_str = Console.ReadLine();
                    }
                    int playerRX = Convert.ToInt32(playerRX_str);
                    indexR = playerRX - 1;
                    
                    // Get player column input
                    Console.WriteLine("Enter column location for player X: ");
                    // Error Checking to ensure only the accepted values are entered.
                    string playerCX_str = Console.ReadLine();
                    while (playerCX_str != "1" && playerCX_str != "2" && playerCX_str != "3") {
                        Console.WriteLine("Invalid Input! Please enter 1, 2, or 3.");
                        playerCX_str = Console.ReadLine();
                    }
                    int playerCX = Convert.ToInt32(playerCX_str);
                    indexC = playerCX - 1;
                    
                    // Places 'X' on designated spot if spot is empty
                    if (board[indexR, indexC] == "*") {
                        board[indexR, indexC] = "X";
                        turn = "o";
                    }
                    else {
                        Console.WriteLine("Cannot play there! Try again.");
                        turn = "x";
                    }
                }
                Console.WriteLine();
                
                // Prints board
                printBoard(board);

                // Checks to see if player X won
                winNum = checkWin(board, rows, cols);
                if (winNum == 1) {
                    winX = 1;
                    Console.WriteLine("Player X has won! Congratulations!");
                    tttWLT[0]++;
                    t1W++;
                    tttWLT[4]++;
                    t2L++;
                    break;
                }
                // Checks to see if board is full and tie game
                else if (winNum == 3) {
                    winO = 0;
                    winX = 0;
                    Console.WriteLine("The board is full! Tie game.");
                    t1T++;
                    tttWLT[2]++;
                    t2T++;
                    tttWLT[5]++;
                    break;
                }

                // Enter Rows + Cols for O
                // Loops through while it is Player O's turn
                // Loops so that it can do it again if an invalid input is given
                while (turn.ToLower() == "o") {
                    // Get player row input
                    Console.WriteLine("Enter row location for player O: ");

                    // Error Checking to ensure only the accepted values are entered.
                    string playerRO_str = Console.ReadLine();
                    while (playerRO_str != "1" && playerRO_str != "2" && playerRO_str != "3") {
                        Console.WriteLine("Invalid Input! Please enter 1, 2, or 3.");
                        playerRO_str = Console.ReadLine();
                    }
                    int playerRX = Convert.ToInt32(playerRO_str);
                    indexR = playerRX - 1;
                    
                    // Get player column input
                    Console.WriteLine("Enter column location for player O: ");
                    // Error Checking to ensure only the accepted values are entered.
                    string playerCO_str = Console.ReadLine();
                    while (playerCO_str != "1" && playerCO_str != "2" && playerCO_str != "3") {
                        Console.WriteLine("Invalid Input! Please enter 1, 2, or 3.");
                        playerCO_str = Console.ReadLine();
                    }
                    int playerCX = Convert.ToInt32(playerCO_str);
                    indexC = playerCX - 1;
                    
                    // Places 'O' on spot if empty
                    if (board[indexR, indexC] == "*") {
                        board[indexR, indexC] = "O";
                        turn = "x";
                    }
                    else {
                        Console.WriteLine("Cannot play there! Try again.");
                        turn = "o";
                    }
                }
                Console.WriteLine();

                // Prints board
                printBoard(board);

                // Checks to see if player O won
                winNum = checkWin(board, rows, cols);
                if (winNum == 2) {
                    winO = 1;
                    Console.WriteLine("Player O has won! Congratulations!");
                    t2W++;
                    tttWLT[3]++;
                    t1L++;
                    tttWLT[1]++;
                    break;
                }
                // Checks to see if it's a tie
                else if (winNum == 3) {
                    winO = 0;
                    winX = 0;
                    Console.WriteLine("The board is full! Tie game.");
                    t1T++;
                    tttWLT[2]++;
                    t2T++;
                    tttWLT[5]++;
                    break;
                }
            }
            
            // Asks user if they want to play again
            playAgain = again();
            if (playAgain == true) {
                winX = 0;
                winO = 0;
                board = initBoard(rows, cols);
                printBoard(board);
            }
        }

        // Thanks for playing
        Console.Clear();
        Console.WriteLine("Thanks for playing dice! \n ");
        Console.WriteLine($"Player X's record for this game session was {t1W}W - {t1L}L - {t1T}T ");
        Console.WriteLine($"Player O's record for this game session was {t2W}W - {t2L}L - {t2T}T \n");
        return tttWLT;
    }

    // Initialized the board
    static string[,] initBoard(int rows, int cols) {
        string[,] board = new string[rows, cols]; 
        for (int indexR = 0; indexR <= rows -1 ; indexR++) {
            for (int indexC = 0; indexC <= cols -1; indexC++) {
                board[indexR,indexC] = "*";
            }
        }
        return board;
    }

    // Prints board
    static void printBoard(string[,] board) {
        // Print Board
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                Console.Write(board[r, c]);
                if (c < 2) {
                    Console.Write(" | ");
                }
            }
            Console.WriteLine();
            if (r < 2) {
                Console.WriteLine("---------");
            }
        }
        Console.WriteLine();
    }

    // Module checks for all possible win options for each player and 
    //          also for a tie if the board is full and no win conditions are met
    static int checkWin(string[,] board, int rows, int cols) {
        // Return values meaning: 
        //          0  -->  Continue playing
        //          1  -->  Player X won
        //          2  -->  Player O won
        //          3  -->  Tie game, full board, no winners
        
        // Initialize variables
        int indexR;
        int indexC;

        // Rows Checks for Winner
        for (indexR = 0; indexR <= rows - 1; indexR++) {
            if (board[indexR, 0] != "*") {
                if (board[indexR, 0] == board[indexR, 1]) {
                    if (board[indexR, 1] == board[indexR, 2]) {
                        if (board[indexR, 0] == "X") {
                            return 1;
                        }
                        else {
                            return 2;
                        }
                    }
                }
            }
        }

        // Cols Check for Winner
        for (indexC = 0; indexC <= cols - 1; indexC++) {
            if (board[0, indexC] != "*") {
                if (board[0, indexC] == board[1, indexC]) {
                    if (board[1, indexC] == board[2, indexC]) {
                        if (board[0, indexC] == "X") {
                            return 1;
                        }
                        else {
                            return 2;
                        }
                    }
                }    
            }
        }

        // Diagonal Check for Winner
        if (board[0, 0] != "*") {
            if (board[0, 0] == board[1, 1]) {
                if (board[1, 1] == board[2, 2]) {
                    if (board[0, 0] == "X") {
                        return 1;
                    }
                    else {
                        return 2;
                    }
                }    
            }
        }

        // 2nd Diagonal Check for Winner
        if (board[0, 2] != "*") {
            if (board[0, 2] == board[1, 1]) {
                if (board[1, 1] == board[2, 0]) {
                    if (board[0, 2] == "X") {
                        return 1;
                    }
                    else {
                        return 2;
                    }
                }
            }
        }
        // Checks for Tie
        int fullBoard = 0;
        for (indexR = 0; indexR <= rows - 1; indexR++) {
            for (indexC = 0; indexC <= cols - 1; indexC++) {
                if (board[indexR,indexC] != "*") {
                    fullBoard++;
                }
            }
        }
        if (fullBoard == rows * cols) {
            return 3;
        }
        
        // Return 0 to keep playing if no one has won or tied yet
        return 0;
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