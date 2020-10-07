package btu;
import java.util.*;

public class Task2 {
    private Scanner input = new Scanner(System.in);

    public void Task2(){
        System.out.println("\nEnter first num:");
        int num1 = input.nextInt();
        System.out.println("\nEnter second num:");
        int num2 = input.nextInt();
        System.out.println("\nProcessing...\n");
        int result1 = num1 / num2;
        int result2 = num2 % num1;

        System.out.println(result1 + "\n" + result2);
    }
}
