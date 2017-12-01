package Chapter4;
import java.util.Scanner;

public class proj4_3 {
    public static void main(String[] args){

        // A 2 minute telephone call to Lexington, Virginia, costs $1.15. Each additional minute costs $0.50. Write a
        // program that takes the total length of a call in minutes as input and calculates and displays the cost.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your call length (doubles accepted): ");
        double call = scanner.nextDouble();

        int minutes = (int) (call + 0.5);
        double cost = 1.15;

        if (call == 0){
            System.out.print("You did not even make a call, your cost is 0.");
        } else if (minutes <= 2){
            System.out.print("It will cost you: $" + cost);
        } else {
            cost = cost + ((minutes - 2) * .5);
            System.out.print("It will cost you: $" + cost);
        }






    }
}
