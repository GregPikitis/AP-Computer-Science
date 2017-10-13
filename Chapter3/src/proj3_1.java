import java.util.Scanner;

public class proj3_1 {
    public static void main(String [] args) {
        // The surface area of a cube can be known if we know the length of an edge. Write a program that takes the
        // length of an edge (an integer) as input and prints the cube's surface area as output.

        Scanner scanner = new Scanner(System.in);

        int edge;
        int sArea;

        System.out.print("Input the length of one edge of a cube: ");
        edge = scanner.nextInt();

        int love = 6;
        sArea = edge*edge*love;

        System.out.println("The surface area of a cube with an edge of " + edge + " is " + sArea);

    }
}
