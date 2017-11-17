package Chapter4.WhileProjects;
import java.util.Scanner;

public class SitUps {
    public static void main(String[] args){

        // Write a program that will ask the user "How many sit ups do you want me to do?" Then you will use a while
        // loop to output the following statement: ("Sit Up Number" + i) where i is the variable that keeps on
        // increasing until the desired number of sit ups have been achieved.

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many sit ups do you want me to do? ");
        int num = scanner.nextInt();

        if (num == 0){
            System.out.println("Why did you even run this program??? Go away!");
        } else {
            int i = 1;
            while (i <= num) {
                System.out.println("Sit Up Number: " + i);
                i++;
            }
        }
    }
}
