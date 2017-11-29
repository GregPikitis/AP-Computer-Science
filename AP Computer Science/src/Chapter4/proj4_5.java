package Chapter4;
import java.util.Scanner;

public class proj4_5 {
    public static void main(String[] args){

        // The German mathmatician Gottfried Leibniz developed the following method to approximate the value of pi:
        // pi/4 = 1 - 1/3 + 1/5 - 1/7 + ...
        // Write a program that allows the user to specify the number of iterations used in this approximation and
        // displays the resulting value.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of Iterations to find pi/4: ");

        int iterations = scanner.nextInt();
        double piOverFour = 0;
        double divideNum = 1;

        for(int i = 1; i <= iterations; i++){

            System.out.println("Iteration: " + i);

            if (i % 2 == 0){
                piOverFour = piOverFour - (1/divideNum);
            } else {
                piOverFour = piOverFour + (1/divideNum);
            }
            divideNum = divideNum + 2;
        }

        System.out.println("pi after that many iterations is equal to: ");
        System.out.print(piOverFour*4);
    }
}
