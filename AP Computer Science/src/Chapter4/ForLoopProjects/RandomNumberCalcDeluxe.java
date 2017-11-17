package Chapter4.ForLoopProjects;
import java.util.Scanner;
import java.util.Random;

public class RandomNumberCalcDeluxe {
    public static void main(String[] args){

        // Modify the RandomNumberCalc program so that it asks the user for the number of random numbers desired and also
        // for the range.)

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many random numbers would you like to generate? ");
        int nums = scanner.nextInt();

        System.out.print("What would you like your maximum to be? ");
        int max = scanner.nextInt();

        System.out.print("What would you like your minimum to be? ");
        int min = scanner.nextInt();

        for(int i = 1; i <= nums; i++){
            System.out.println(random.nextInt((max - min) + 1) + min);
        }
    }
}
