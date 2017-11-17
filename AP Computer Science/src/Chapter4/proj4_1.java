package Chapter4;
import java.util.Scanner;

public class proj4_1 {
    public static void main(String[] args){
        // When you first learned to divide, you expressed nswers using a quotient and a remainder rather than a
        // fraction or a decimal quotient. For example, if you divide 9 by 2, you gave the answer as 4r 1. Write a
        // program that takes two integers as inputs and displays their quotient and remainder as outputs. Do not assume
        // that the integers are entered in any order, be sure to divide the larger integer by the smaller integer.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please put in your first integer (order doesn't matter): ");
        int num1 = scanner.nextInt();

        System.out.print("Please put in your first number, (order doesn't matter): ");
        int num2 = scanner.nextInt();

        if (num1 >= num2){
            System.out.println(num1 + " divided by " + num2 + " is " + (num1 / num2) + "r" + (num1 % num2));
        } else {
            System.out.println(num2 + " divided by " + num1 + " is " + (num2 / num1) + "r" + (num2 % num1));
        }
    }
}
