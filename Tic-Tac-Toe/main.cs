// 
// Author: Cameron Lewis
// Title: Tic-Tac-Toe Game
// Purpose: ISMN3080 Program #5 Assignment
// Date Created: 8 NOV 2023
// Date Modified: 9 NOV 2023
// 

internal class TicTacToe {
    static void Main (string[] args) {
        // Declare Variables
        int rows = 3;
        int cols = 3;
        int indexR;
        int indexC;
        int winX = 0;
        int winO = 0;
        string turn = "x1";
        int winNum;

        // Initialize Board
        string[,] board = new string[rows, cols]; 
        for (indexR = 0; indexR <= rows -1 ; indexR++) {
	        for (indexC = 0; indexC <= cols -1; indexC++) {
		        board[indexR,indexC] = "*";
	        }
        }
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

        // Playing X’s/O’s AKA Game
        while (winX == 0 && winO == 0) {
            // Enter Rows + Cols for X
            // Loops through while it is Player X's turn
            // Loops so that it can do it again if an invalid input is given
            while (turn.ToLower() == "x") {
                // Get player row input
                Console.WriteLine("Enter row location for player X: ");
                int playerRX = Convert.ToInt32(Console.ReadLine());
                indexR = playerRX - 1;
                
                // Get player column input
                Console.WriteLine("Enter column location for player X: ");
                int playerCX = Convert.ToInt32(Console.ReadLine());
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
            // Checks to see if player X won
            winNum = checkWin(board, rows, cols);
            if (winNum == 1) {
                winX = 1;
                Console.WriteLine("Player X has won! Congratulations!");
                break;
            }
            // Checks to see if board is full and tie game
            else if (winNum == 3) {
                winO = 0;
                winX = 0;
                Console.WriteLine("The board is full! Tie game.");
                break;
            }

            // Enter Rows + Cols for O
            // Loops through while it is Player O's turn
            // Loops so that it can do it again if an invalid input is given
            while (turn.ToLower() == "o") {
                // Get player input for row
                Console.WriteLine("Enter row location for player O: ");
                int playerRO = Convert.ToInt32(Console.ReadLine());
                indexR = playerRO - 1;
                
                // Get player input for column
                Console.WriteLine("Enter column location for player O: ");
                int playerCO = Convert.ToInt32(Console.ReadLine());
                indexC = playerCO - 1;
                
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

            // Checks to see if player O won
            winNum = checkWin(board, rows, cols);
            if (winNum == 2) {
                winO = 1;
                Console.WriteLine("Player O has won! Congratulations!");
                break;
            }
            // Checks to see if it's a tie
            else if (winNum == 3) {
                winO = 0;
                winX = 0;
                Console.WriteLine("The board is full! Tie game.");
                break;
            }
        }
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
}