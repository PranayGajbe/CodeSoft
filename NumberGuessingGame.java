import java.util.Random;
import java.util.Scanner;

public class NumberGussingGame{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 8;

        boolean playAgain = true;

        System.out.println("I'm thinking of a number between 1 and 100!");

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("\nNew Round!");
            System.out.println("I've chosen a mysterious number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + maxAttempts + " attempts to unveil the mystery.");

            while (attempts < maxAttempts) {
                System.out.print("Take a guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Hooray! You've cracked the mystery number " + targetNumber + " in just " + attempts + " attempts.");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low. Remaining attempts: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Your guess is too high. Remaining attempts: " + (maxAttempts - attempts));
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Oops, you've used all your attempts. The hidden number was: " + targetNumber);
            }

            System.out.print("Would you like to play again? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            playAgain = choice.equals("yes") || choice.equals("y");
        }

        System.out.println("Thank you for delving into the Mystery Number Game!");
        scanner.close();
    }
}
