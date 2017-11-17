package Chapter4;
import java.util.Scanner;


public class proj4_2 {
    public static void main(String[] args) {
        // Write a program that takes the lengths of three sides of a triangle as inputs. The program should display
        // whether or not the triangle is a right triangle.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Input side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Input side 3: ");
        int side3 = scanner.nextInt();

        if ((side1 > side2) && (side1 > side3)) {
            if (Math.pow(side1, 2) == (Math.pow(side2, 2) + Math.pow(side3, 2))) {
                System.out.println("This is a right triangle. Side 1 is the hypotenuse");
            } else {
                System.out.print("This isn't a right triangle.");
            }
        } else if ((side2 > side1) && (side2 > side3)) {
            if (Math.pow(side2, 2) == (Math.pow(side1, 2) + Math.pow(side3, 2))) {
                System.out.println("This is a right triangle. Side 2 is the hypotenuse");
            } else {
                System.out.print("This isn't a right triangle.");
            }
        } else if ((side3 > side1) && (side3 > side2)) {
            if (Math.pow(side3, 2) == (Math.pow(side1, 2) + Math.pow(side2, 2))) {
                System.out.println("This is a right triangle. Side 3 is the hypotenuse");
            } else {
                System.out.print("This isn't a right triangle.");
            }
        } else {
            System.out.print("Something went wrong, this probably isn't a right triangle.");
        }
    }
}
