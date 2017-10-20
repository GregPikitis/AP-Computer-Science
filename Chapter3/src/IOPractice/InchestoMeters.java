package IOPractice;
import java.util.*;

public class InchestoMeters {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        double inches;
        double meters;

        System.out.print("Input inches to convert to meters: ");
        inches = scanner.nextDouble();

        meters = inches * .0254;

        System.out.print("That is equal to " + meters + "m.");
    }
}
