package Chapter4.WhileProjects;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

        // Write a program that will ask the user to enter a number. The problem will then output the multiplication
        // table for that number from 1 to 10. Format the output so that it will look like, "3 * 1 = 3"

        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to see the multiplication table of? ");
        int num = scanner.nextInt();

        int count = 0;

        while (count <= 10){
            System.out.println(num + " * " + count + " = " + num * count);
            count++;
        }
    }
}
