package Chapter4.ForLoopProjects;
import java.util.Random;

public class RandomNumberCalc {
    public static void main(String[] args){

        // Write a program that will use a for loop to output 10 random numbers from 0 to 100.

        Random random = new Random();

        for(int i = 1; i <= 10; i++){
            System.out.println(random.nextInt((100) + 1));
        }
    }
}
