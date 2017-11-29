package Chapter4.NestedLoops;
import java.util.Scanner;

public class MeaningofLife {
    public static void main(String[] args){
         // Repeat "what is the meaning to life" until the user inputs "42"

        Scanner scanner = new Scanner(System.in);

        boolean yay = false;
        String userInput = "";

        while (yay == false){
            System.out.print("What is the meaning to life? ");
            userInput = scanner.next();

            if (userInput.equals("42") == true){
                System.out.print("Yes!! You got it!");
                yay = true;
            } else {
                System.out.println("That's completely false, try again.");
            }
        }
    }
}
