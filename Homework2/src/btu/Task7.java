package btu;
import java.util.*;

public class Task7 {
    private Scanner input = new Scanner(System.in);

    public void Task7(){
        System.out.println("\nEnter first num:");
        int num1 = input.nextInt();
        System.out.println("\nEnter second num:");
        int num2 = input.nextInt();
        int gcd = GCD(num1, num2);
        int lcm = LCM(num1, num2, gcd);

        System.out.format("\nGCD: %d\nLCM: %d", gcd, lcm);
    }
    private int GCD(int num1, int num2){
        if (num1 == 0)
            return num2;
        else
            return GCD((num2 % num1), num1);
    }

    private int LCM(int num1, int num2, int gcd){
        return (num1 * num2) / gcd;
    }
}
