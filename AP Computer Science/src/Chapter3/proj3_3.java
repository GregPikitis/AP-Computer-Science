package Chapter3;

import java.util.Scanner;

public class proj3_3 {
    public static void main (String [] args) {
        // The kinetic energy of a moving object is given by the formula KE=(1/2)mv2, where m is the object's mass and
        // v is its velocity. Modify the program you created in Chapter 2, Project 2-5, so that it prints the object's
        // kinetic energy as well as its momentum.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input mass in kilograms: ");
        double mass = scanner.nextDouble();

        System.out.print("Input velocity in meters per second: ");
        double velocity = scanner.nextDouble();

        double momentum = mass * velocity;
        double kinetic = .5 * mass * velocity * velocity;

        System.out.println("The momentum of that object is " + momentum);
        System.out.println("The kinetic energy of that object is " + kinetic);
    }
}
