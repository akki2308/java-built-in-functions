import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking date input from user
        System.out.print("Enter a date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(sc.next());

        // Adding 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtracting 3 weeks
        modifiedDate = modifiedDate.minusWeeks(3);

        // Define date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Display final modified date
        System.out.println("Final date after modifications: " + modifiedDate.format(formatter));

        sc.close();
    }
}
