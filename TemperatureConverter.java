import java.util.Scanner;

public class TemperatureConverter {
    
    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        
        double celsius = fahrenheitToCelsius(temp);
        double fahrenheit = celsiusToFahrenheit(temp);
        
        System.out.println(temp + "°F is " + celsius + "°C");
        System.out.println(temp + "°C is " + fahrenheit + "°F");
        
        sc.close();
    }
}
