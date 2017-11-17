package Chapter4.IfElseProjects;
import java.util.Scanner;

public class TheClub {
    public static void main(String[] args){

        //Write a program that will output the following "Welcome to the Java Night Club, How old are you". If the user
        // is older than 18 I want the program to output "welcome, Have Fun," if the user is under 18 it should say "Get
        // out of here little kid!"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to The Club, input your age: ");
        int age = scanner.nextInt();

        if (age >= 21){
            System.out.print("Welcome!!");
        } else {
            System.out.print("Sorry you are too young for The Club.");
        }
    }
}
