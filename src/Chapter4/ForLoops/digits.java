package Chapter4.ForLoops;

public class digits {
    public static void main(String[] args){

        // Build a string consisting of the first 10 positive digits in descending order.

        String myString = "";

        for (int i = 10; i >= 1; i--){
            myString = myString + i + " ";
        }

        System.out.println(myString);
    }
}
