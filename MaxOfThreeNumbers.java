import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static void main(String[] args) {
        // Taking three integer inputs
        int num1 = getUserInput("Enter first number: ");
        int num2 = getUserInput("Enter second number: ");
        int num3 = getUserInput("Enter third number: ");

        // Finding the maximum value
        int maxNumber = findMax(num1, num2, num3);

        // Displaying the result
        System.out.println("The maximum of the three numbers is: " + maxNumber);
    }

    // Function to take user input
    public static int getUserInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }

    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
