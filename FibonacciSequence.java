import java.util.Scanner;

public class FibonacciSequence {

    // Function to calculate and print Fibonacci sequence
    public static void printFibonacci(int terms) {
        // Initial two Fibonacci numbers
        int first = 0, second = 1;

        // Print the Fibonacci sequence
        System.out.print("Fibonacci Sequence: ");

        // Loop to generate and print the Fibonacci sequence
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            // Calculate the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(); // To move to the next line after the sequence
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the number of terms
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int terms = sc.nextInt();

        // Call the function to print Fibonacci sequence
        printFibonacci(terms);

        sc.close();
    }
}
