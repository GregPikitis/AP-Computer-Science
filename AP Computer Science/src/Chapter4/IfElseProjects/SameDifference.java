package Chapter4.IfElseProjects;
import java.util.Scanner;

public class SameDifference {
    public static void main (String[] args){

        // Write a program that will ask the user to enter two numbers. Use an if/else statement and the equality
        // operator ("==") to check if the numbers are the same. If they are I want the program to output "These two
        // numbers are the same. "If the numbers are different, I want the program to output "THose numbers are
        // different."

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input your second number: ");
        int num2 = scanner.nextInt();

        if ((num1 == 5 || num1 == 7)&& (num2 == 7 || num2 == 5)) {
            System.out.println("Those numbers are equal if and only if you are a massive meme.");
        } else if (num1 == num2){
            System.out.println("Those numbers are equal");
        } else {
            System.out.println(num1 + " is not equal to " + num2);
        }





    }
}
