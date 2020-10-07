package btu;
import java.util.*;

public class Task5 {
    private Scanner input = new Scanner(System.in);

    public void Task5(){
        System.out.println("\nEnter four digit num:");

        try{
            int four_digit = input.nextInt();

            String number = String.valueOf(four_digit);
            char[] digits = number.toCharArray();

            if(digits.length == 4) {
                int sum = 0;

                for(char i:digits)
                    sum += Character.getNumericValue(i);

                System.out.format("\nSum is: %d\n", sum);
            }
            else {
                System.out.println("\nThe number entered is not four digit.\nTrying again...\n");
                this.Task5();
            }
        }
        catch (Exception e) {
            System.out.println("\nInput is not a number.");
        }
    }
}
