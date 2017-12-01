package Chapter4.ForLoopProjects;
import java.util.Scanner;

public class AverageComputer {
    public static void main(String[] args){

        // Write a program that will ask the user for how many cumbers do they want to average. It will then use a for
        // loop to ask the user the appropriate number of numbers. After the for loop it will output the average.

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers would you like to take the average of? ");
        int nums = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= nums; i++){
            System.out.print("Input one of your numbers: ");
            sum = sum + scanner.nextInt();
        }

        double average = sum / nums;

        System.out.print("Your average is: " + average);
    }
}
