package Chapter4.ForLoops;

public class squaresAndCubes {
    public static void main(String[] args){

        // Print the squares and cubes of the first 10 positive integers.

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            System.out.println("Square: " + i*i);
            System.out.println("Cube: " + i*i*i);
            System.out.println();
        }
    }
}
