package Chapter4.IfElseProjects;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args){

        // Write a program that will ask the user to enter the amount of money they made this week and then it will ask
        // the user how much money they spent this week (both should be stored in double variables). Now use an if/else
        // to determine if the user made more money than they spent. If they did it should output "you made a profit
        // this week." Otherwise, it should say "You lost money this week!"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your income from this week: $");
        double income = scanner.nextDouble();

        System.out.print("Input your expenses from this week: $");
        double expenses = scanner.nextDouble();

        if (income > expenses){
            System.out.println("You made $" + (income - expenses) + " this week.");
        } else if (income < expenses){
            System.out.println("You lost $" + (expenses - income) + " this week.");
        } else {
            System.out.println("You broke even!");
        }


    }
}
