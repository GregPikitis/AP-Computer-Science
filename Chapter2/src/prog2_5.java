import java.util.Scanner;

public class prog2_5
{
    public static void main (String [] args) {

        // An object’s momentum is its mass multiplied by its velocity. Write a program that expects an
        // object’s mass (in kilograms) and velocity (in meters per second) as inputs and prints its momentum.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input mass in kilograms: ");
        double mass = scanner.nextDouble();

        System.out.print("Input velocity in meters per second: ");
        double velocity = scanner.nextDouble();

        double momentum = mass*velocity;

        System.out.println("The momentum of that object is " + momentum);
    }
}


