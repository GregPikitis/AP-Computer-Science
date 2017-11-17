package Chapter3.IOPractice;

import java.util.Scanner;

public class powers {
    public static void main(String[] args){

        // Write a Java program that reads a number and display the square, cube, and fourth power.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        double num = scanner.nextInt();

        System.out.println("The square is " + (Math.pow(num, 2)));
        System.out.println("The cube is " + (Math.pow(num, 3)));
        System.out.println("The fourth power is " + (Math.pow(num, 4)));
    }
}
