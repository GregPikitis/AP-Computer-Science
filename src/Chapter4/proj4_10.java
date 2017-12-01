package Chapter4;
import java.util.Scanner;

public class proj4_10 {
    public static void main(String[] args){

        // Teachers in most school districts are paid on a schedule that provides a salary based on their number of
        // years of teaching experience. For example, a beginning teacher in the Bellingham School District might be paid
        // $30,000 the first year. For each year of experience after this up to 10 years, a 2 percent increase over the
        // preceding value is received. Write a program that displays a salary schedule for teachers in a school
        // district. The Inputs are the starting salary, the percentage increase, and the number of years in the
        // schedule. Each row in the schedule should contain the year number and the salary for that year.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Starting Salary: ");
        double startingSalary = scanner.nextDouble();

        System.out.print("Percentage Increase: ");
        double percentageIncrease = scanner.nextDouble();

        System.out.print("Years in Future: ");
        double years = scanner.nextDouble();

        double pay = startingSalary;

        for (int i = 1; i <= years; i++){
            pay = (pay/100) * percentageIncrease + pay;
            System.out.println("Year " + i + ": $" + (pay));
        }

    }
}
