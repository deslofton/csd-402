/*
 * Name: Desarai Lofton
 * Course: CSD 402
 * Module 2 Assignment
 * Rock-Paper-Scissors Game
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate computer choice (1-3)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user
        System.out.println("Rock-Paper-Scissors");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1-3): ");

        int userChoice = input.nextInt();

        // Convert choices to words
        String computerMove = getChoiceName(computerChoice);
        String userMove = getChoiceName(userChoice);

        // Display selections
        System.out.println("\nComputer chose: " + computerMove);
        System.out.println("You chose: " + userMove);

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("Result: It's a tie!");
        }
        else if ((userChoice == 1 && computerChoice == 3) ||
                 (userChoice == 2 && computerChoice == 1) ||
                 (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Result: You win!");
        }
        else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }

    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid Choice";
        }
    }
}