package Chapter2;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        
        System.out.print("Enter degrees Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        
        celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
    
        System.out.print("The equivalent in Celsius is ");
        System.out.println(celsius);
    }
}