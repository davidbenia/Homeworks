package btu;
import java.util.*;

public class Task6 {
    private Scanner input = new Scanner(System.in);

    public void Task6(){
        System.out.println("\nEnter any num:");

        try{
            int any_digit = input.nextInt();

            String number = String.valueOf(any_digit);
            char[] digits = number.toCharArray();
            int sum = 0;

            for(char i:digits)
                sum += Character.getNumericValue(i);

            System.out.format("\nSum is: %d\n", sum);
        }
        catch (Exception e){
            System.out.println("\nInput is not a number.");
        }
    }
}
