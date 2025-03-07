import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int low = 1, high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100. The computer will try to guess it!");
        
        while (true) {
            // Generate a random guess within the range
            guess = random.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");

            // Get user feedback
            feedback = sc.next().toLowerCase();

            // Check feedback
            if (feedback.equals("correct")) {
                System.out.println("Yay! The computer guessed your number correctly: " + guess);
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1; // Adjust upper bound
            } else if (feedback.equals("low")) {
                low = guess + 1; // Adjust lower bound
            } else {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }

            // If bounds become invalid, stop guessing
            if (low > high) {
                System.out.println("Something went wrong! Did you change your number? Restart the game.");
                break;
            }
        }

        sc.close();
    }
}
