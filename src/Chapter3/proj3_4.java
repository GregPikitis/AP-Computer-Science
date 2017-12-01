package Chapter3;

import java.util.Scanner;

public class proj3_4 {
    public static void main (String [] args){

        // An employee's total weekly pay equals the hourly wage multiplied by the total number of regular hours plus
        // any overtime pay. Overtime pay equals the total overtime hours multiplied by 1.5 times the hourly wage. Write
        // a program that takes as inputs the hourly wage, total regular hours and  total overtime hours and displays an
        // employee's total weekly pay.

        Scanner scanner = new Scanner(System.in);

        double hourlyWage, regularHours, overtime, overtimePay, regularPay, totalPay;

        System.out.print("Input hourly wage: ");
        hourlyWage = scanner.nextDouble();

        System.out.print("Input total regular hours per week: ");
        regularHours = scanner.nextDouble();

        System.out.print("Input number of overtime hours: ");
        overtime = scanner.nextDouble();

        overtimePay = overtime * hourlyWage * 1.5;
        regularPay = regularHours * hourlyWage;
        totalPay = regularPay + overtimePay;

        System.out.print("Your total weekly pay is $" + totalPay);
    }
}
