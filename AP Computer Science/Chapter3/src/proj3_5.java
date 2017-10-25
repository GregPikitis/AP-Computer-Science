import java.util.Scanner;

public class proj3_5 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        double hourlyWage;
        double earning;
        double total = 0; // <3
        double regularHours[] = new double[5];
        double overtimeHours[] = new double[5];
        double regularPay[] = new double[5];
        double overtimePay[] = new double[5];

        System.out.print("Input your hourly pay: ");
        hourlyWage = scanner.nextDouble();


        for (int count=0; count<=4; count++){
            System.out.print("Input regular hours worked for day " + (count+1) + ": ");
            regularHours[count] = scanner.nextDouble();
            System.out.print("Input overtime hours worked for day " + (count+1) + ": ");
            overtimeHours[count] = scanner.nextDouble();
        }

        for (int i=0; i<=4; i++){
            regularPay[i] = regularHours[i] * hourlyWage;
            overtimePay[i] = overtimeHours[i] * hourlyWage * 1.5;
            total += regularPay[i] + overtimePay[i];
        }

        for (int i=0; i<=4; i++){
            System.out.println("Day " + (i+1) + ": You worked " + regularHours[i] + " regular hours and " + overtimeHours[i] + " overtime hours.");
            System.out.println("Earnings: $" + (regularPay[i] + overtimePay[i]));
        }

        System.out.println("Total Earnings: $" + total);
    }
}
