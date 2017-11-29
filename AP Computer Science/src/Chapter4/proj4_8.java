package Chapter4;

import java.util.Scanner;

public class proj4_8 {
    public static void main(String[] args){

        // Modify the program of Project 4-7 so that the user can specify the base (2 or higher) as well. The first line
        // of the output should display which base was entered.

        Scanner scanner = new Scanner(System.in);

        boolean done = false;
        int num;

        while (true){
            System.out.print("What base? (-1 to exit) ");
            int base = scanner.nextInt();

            if (base == -1){
                break;
            }

            System.out.print("What power? (-1 to exit) ");
            int power = scanner.nextInt();

            if (power == -1){
                break;
            }

            System.out.println("Base: " + base);
            System.out.println("Power: " + power);
            System.out.println("Result: " + Math.pow(base,power));
            System.out.println();
        }
    }
}
