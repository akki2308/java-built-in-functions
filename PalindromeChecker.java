import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(isPalindrome(input) ? "The entered string is a palindrome." 
                                               : "The entered string is not a palindrome.");
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) if (str.charAt(left++) != str.charAt(right--)) return false;
        return true;
    }
}
