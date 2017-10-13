import java.util.Scanner;

public class TestTerminalIO {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double weight;

        System.out.print("Enter your name (a string): ");
        name = scanner.nextLine();

        System.out.print("Enter your age (an integer): ");
        age = scanner.nextInt();

        System.out.print("Enter your weight (a double): ");
        weight = scanner.nextDouble();

        System.out.println("Greetings " + name +
                            ", you are " + age +
                            " years old and you weigh " + weight +
                            " pounds.");
    }
}
