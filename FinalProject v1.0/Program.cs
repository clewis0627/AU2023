// 
// Author: Cameron Lewis
// Title: Trifecta
// Purpose: ISMN3080 Final Project
// Description: 
    // Create a menu-driven game with a Main Menu to select which game to play
    // Game Options are:
        // Dice --> 1p vs Computer
        // TicTacToe --> 1p vs 2p
        // Rock, Paper, Scissors --> 1p vs Computer
    // Error checking as much as possible
    // File output of scores based on game
        // Win-Lose-Tie record added to file
    // Prompt to play again
        // Yes or No, if no then return to menu
// Date Created: 13 NOV 2023
// Date Modified: 28 NOV 2023
// Version: 1.0
//

using System;
using System.Data.Common;
using System.IO;
using System.Linq;

class Program {
    static void Main(string[] args) {
        // Clears console input/output before game starts
        Console.Clear();

        // Starts new Menu object
        Menu mainMenu = new Menu();
        mainMenu.DisplayMenu();

        // Obtains next character/function pressed by user
        Console.ReadKey();
    }
}