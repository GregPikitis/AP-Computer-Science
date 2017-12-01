package Chapter4.IfElseProjects;
import java.util.Scanner;

public class HighestTestScore {
    public static void main(String[] args){

        // Write a program that will ask the user what score Alice got on the test, then it will ask what score Bob got
        // on the test (both of these scores should be stored in Integer variables). It will then check to see who's
        // score is higher and it will output "Alice  did better on the test" or "Bob did better on the test" depending
        // on who does better.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input person 1's score: ");
        double person1 = scanner.nextDouble();

        System.out.print("Input person 2's score: ");
        double person2 = scanner.nextDouble();

        if (person1 > person2){
            System.out.print("Person 1 did better on this test.");
        } else if (person2 > person1){
            System.out.print("Person 2 did better on this test.");
        } else {
            System.out.print("These people have scored the same on the test.");
        }
    }
}
