package Chapter4;
import java.util.Scanner;

public class proj4_7 {
    public static void main(String[] args){

        // Computers use the binary system, which is based on powers of 2. Write a program that displays the positive
        // powers of 2. When the user enters the exponent at a prompt, the program displays 2 to that power. The program
        // halts when the user enters -1.

        Scanner scanner = new Scanner(System.in);

        boolean done = false;
        int num;

        while (true){
            System.out.print("How many powers of 2? (-1 to exit) ");
            num = scanner.nextInt();

            if (num != -1){
                for (int i = 1; i <= num; i++){
                    System.out.println(i + ". " + Math.pow(2,i));
                }
            } else {
                break;
            }
        }
    }
}
