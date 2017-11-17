package Chapter3.IOPractice;
import java.util.*;

public class MinutestoYearsandDays {
    public static void main (String[] args){

        // Write a Java program to convert minutes into a number of years and days.

        Scanner scanner = new Scanner(System.in);
        int minutes;
        int years;
        int daysTemp;
        int days;

        System.out.print("Input minutes to convert to years and days: ");
        minutes = scanner.nextInt();

        daysTemp = minutes / 60 / 24;

        years = daysTemp / 365;

        days = daysTemp % 365;

        System.out.print("That equals about " + years + " years and " + days + " days.");
    }
}
