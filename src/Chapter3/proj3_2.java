package Chapter3;

import java.util.Scanner;

public class proj3_2 {
    public static void main(String [] args) {
        // Write a program that takes the radius of a sphere (a double) as input nd outputs the sphere's diameter,
        // circumference, surface area, and volume.

        Scanner scanner = new Scanner(System.in);

        double radius;
        double diameter;
        double circumference;
        double surfaceArea;
        double volume;

        System.out.print("Input the radius of the sphere: ");
        radius = scanner.nextDouble();

        diameter = radius * 2;
        circumference = 2 * Math.PI * radius;
        surfaceArea = 4 * Math.PI * (radius * radius);
        volume = (4 / 3) * Math.PI * (radius * radius * radius);

        System.out.println("For a sphere with a radius of " + radius + " ...");
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference:" + circumference);
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}
