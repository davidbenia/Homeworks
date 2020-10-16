package businessOperations;

import java.util.Scanner;

public class PercentageCalculators implements PercentageCalculators_Interface{
    Scanner input = new Scanner(System.in);

    @Override
    public double SimpleInterest() {
        double p, q, k = 0.05;
        int n;

        System.out.println("\nHow much money?:");
        p = input.nextDouble();
        System.out.println("\nHow many years?:");
        n = input.nextInt();

        q = p * k * n;

        return q;
    }

    @Override
    public double CompoundInterest() {
        double p, q, k = 0.05;
        int n;

        System.out.println("\nHow much money?:");
        p = input.nextDouble();
        System.out.println("\nHow many years?:");
        n = input.nextInt();

        q = p * Math.pow((1 + (k / n)), (n*((double)n/4)));

        return q;
    }
}
