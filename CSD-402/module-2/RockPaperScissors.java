import java.util.Scanner;
import java.util.Random;

/**
 * CSD 402 - Module 2.2 Assignment
 * Name: Garcia Anthony (AG)
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(inputSource());
        Random random = new Random();

        int computerSelection = random.nextInt(3) + 1;

        System.out.print("Enter a value (1 for Rock, 2 for Paper, 3 for Scissors): ");
        int userSelection = input.nextInt();

        if (userSelection < 1 || userSelection > 3) {
            System.out.println("Invalid selection. Please run the program again and enter 1, 2, or 3.");
            return;
        }

        System.out.println("\n--- Match Details ---");
        System.out.println("Computer selected: " + getChoiceName(computerSelection));
        System.out.println("You selected: " + getChoiceName(userSelection));
        System.out.println("---------------------");

        if (userSelection == computerSelection) {
            System.out.println("Result: It's a tie!");
        } else if ((userSelection == 1 && computerSelection == 3) ||
                   (userSelection == 2 && computerSelection == 1) ||
                   (userSelection == 3 && computerSelection == 2)) {
            System.out.println("Result: Congratulations! You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }

    private static java.io.InputStream inputSource() {
        return System.in;
    }

    private static String getChoiceName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";
        }
    }
}

