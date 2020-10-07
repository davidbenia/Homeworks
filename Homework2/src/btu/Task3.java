package btu;
import java.util.*;

public class Task3 {
    private Scanner input = new Scanner(System.in);

    public void Task3(){
        System.out.println("\nEnter first num:");
        int num1 = input.nextInt();
        System.out.println("\nEnter second num:");
        int num2 = input.nextInt();
        System.out.println("\nEnter third num:");
        int num3 = input.nextInt();
        System.out.println("\nProcessing...\n");

        System.out.println((num1 + num2 + num3) + "\n" + (num1 * num2 * num3));
    }
}
