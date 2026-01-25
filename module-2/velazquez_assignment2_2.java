// JOSE VELAZQUEZ SAENZ 
// MODULE 2.2 ASSIGNMENT 

// THIS PROGRAM PLAYS A GAME OF ROCK, PAPER, SCISSORS AGAINST THE COMPUTER
// THE USER INPUTS THEIR CHOICE AND THE COMPUTER RANDOMLY GENERATES ITS OWN CHOICE
// THE PROGRAM THEN DETERMINES THE WINNER BASED ON THE RULES OF THE GAME. 


import java.util.Random;
import java.util.Scanner;

public class velazquez_assignment2_2 {

    public static void main(String[] args) {

        try ( // Create objects for user input and random number generation
            Scanner input = new Scanner(System.in)) {
            Random random = new Random();
            
            // Generate computer choice (1 = Rock, 2 = Paper, 3 = Scissors)
            int computerChoice = random.nextInt(3) + 1;
            
            // Prompt user
            System.out.println("Rock-Paper-Scissors Game");
            System.out.println("1 = Rock");
            System.out.println("2 = Paper");
            System.out.println("3 = Scissors");
            System.out.print("Enter your choice (1, 2, or 3): ");
            
            int userChoice = input.nextInt();
            
            // Convert numeric choices to words
            String computerMove = convertChoice(computerChoice);
            String userMove = convertChoice(userChoice);
            
            // Display choices
            System.out.println("\nComputer chose: " + computerMove);
            System.out.println("You chose: " + userMove);
            
            // Determine the winner
            if (computerChoice == userChoice) {
                System.out.println("Result: It's a tie!");
            } else if (
                    (userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)
                    ) {
                System.out.println("Result: You win!");
            } else {
                System.out.println("Result: Computer wins!");
            }
        }
    }

    // Method to convert numbers to Rock, Paper, or Scissors
    public static String convertChoice(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid choice";
        };
    }
}
