package Chapter4;
import java.util.Scanner;

public class proj4_6 {
    public static void main(String[] args){

        // A local biologist needs a program to predict population growth. The inputs would be the initial number of
        // organisms, the rate of growth (a real number greater than 0), the number of hours it takes to achieve this
        // rate, and a number of hours during which the population grows. For example, one might start with a population
        // of 500 organisms, a growth rate of 2, and a growth period to achieve this rate of 6 hours. Assuming that none
        // of the organisms die, this would imply that this population would double in size every 6 hours. Thus, after
        // allowing 6 hours for growth, we would have 1000 organisms, and after 12 hours, we would have 2000 organisms.
        // Write a program that takes these inputs and displays a prediction of the total population.

        Scanner scanner = new Scanner(System.in);

        double finalPop = 0;

        System.out.print("Initial Population: ");
        int initialPop = scanner.nextInt();

        System.out.print("Rate of Growth: ");
        double rate = scanner.nextDouble();

        System.out.print("Time to achieve rate: ");
        double ratePeriod = scanner.nextDouble();

        System.out.print("Growth Period: ");
        double growthPeriod = scanner.nextDouble();

        finalPop = ((initialPop * rate) / ratePeriod) * growthPeriod;

        System.out.println("I think your final pop is: " + finalPop);



    }
}

