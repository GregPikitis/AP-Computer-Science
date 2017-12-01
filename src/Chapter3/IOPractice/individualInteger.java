package Chapter3.IOPractice;

import java.util.Scanner;

public class individualInteger {
    public static void main (String[] args){

        //Write a Java program to break an integer into a sequence of individual digits.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int num = scanner.nextInt();

        String numNew = Integer.toString(num);

        for (int i = 0; i < numNew.length(); i++){
            System.out.println(numNew.charAt(i));
        }
    }
}
