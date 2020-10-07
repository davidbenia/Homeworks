package btu;
import java.util.*;

public class Task8 {
    private Scanner input = new Scanner(System.in);

    public void Task8(){
        System.out.println("\nEnter start num:");
        int num1 = Math.abs(input.nextInt());
        System.out.println("\nEnter end num:");
        int num2 = Math.abs(input.nextInt());
        int start, end;

        if(num1 < num2){
            start = num1;
            end = num2;
        }
        else{
            start = num2;
            end = num1;
        }

       System.out.println("\nNumbers are:\n" + Arrays.toString(Printer(start, end)) + "\n");
    }
    private int[] Printer(int start, int end){
        int[] numbers = new int[(end - start) - 1];
        int i = 0;
        int num = start + 1;

        while(numbers[((end - start) - 2)] != (end - 1)){
            numbers[i] = num;
            i++;
            num++;
        }

        return numbers;
    }
}
