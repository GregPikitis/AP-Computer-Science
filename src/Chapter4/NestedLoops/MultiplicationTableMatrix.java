package Chapter4.NestedLoops;

public class MultiplicationTableMatrix {
    public static void main(String[] args){

        // Write a program that will output the 10 times multiplication table.

        String printString = "";
        int num;

        for (int i = 1; i <= 10; i++){
            for (int y = 1; y <= 10; y++){
                num = i*y;
                if (num < 10){
                    printString = printString + "0" + num + " ";
                } else {
                    printString = printString + num + " ";
                }
            }
            System.out.println(printString);
            printString = "";
        }
        System.out.println("<3");

    }
}
