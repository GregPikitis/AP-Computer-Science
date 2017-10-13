import java.util.Scanner;

public class proj3_5 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        double total; // <3
        double regularHours[] = new double[5];
        double overtimeHours[] = new double[5];

        for (int count = 5){
            System.out.print("Input regular hours worked for day" + count + ": ");
            regularHours[count] = scanner.nextDouble();
            System.out.print("Input overtime hours worked for day" + count + ": ");
            overtimeHours[count] = scanner.nextDouble();
        }



    }
}
