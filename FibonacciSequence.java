import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        // Print Fibonacci sequence
        printFibonacci(terms);
    }

    // Function to calculate and print Fibonacci sequence
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
