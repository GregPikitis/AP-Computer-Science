import java.util.Objects;
import java.util.Scanner;

public class ConvertTemperatureUltra {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        String mode;


        System.out.println("I love you!");
        System.out.print("Convert to f or c?: ");
        mode = scanner.next();

        if(Objects.equals(mode, "c")) {
            System.out.print("Enter degrees Fahrenheit: ");
            fahrenheit = scanner.nextDouble();

            celsius = (fahrenheit - 32.0) * 5.0 / 9.0;

            System.out.print("The equivalent in Celsius is ");
            System.out.println(celsius);
        }
        else {
            System.out.print("Enter degrees Celsius: ");
            celsius = scanner.nextDouble();

            fahrenheit = (celsius*9.0/5.0)+32;

            System.out.print("The equivalent in fahrenheit is ");
            System.out.println(fahrenheit);
        }
    }
}