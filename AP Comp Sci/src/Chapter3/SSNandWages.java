package Chapter3;

import java.util.Scanner;

public class SSNandWages {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        double wage;
        String ssn;

        System.out.print("Input hourly wage: ");
        wage = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Input your social security number: ");
        ssn = scanner.nextLine();

        System.out.println("Your ssn is " + ssn + " and your hourly wage is $" + wage + "per hour");
    }
}
