package btu;
import java.util.*;

public class Task4 {
    private Scanner input = new Scanner(System.in);

    public void Task4(){
        System.out.println("\nEnter three digit num:");
        try{
            int three_digit = input.nextInt();

            String number = String.valueOf(three_digit);
            char[] digits = number.toCharArray();

            if(digits.length == 3)
                for(char i:digits)
                    System.out.format("\n%s", i);
            else {
                System.out.println("\nThe number entered is not three digit.\nTrying again...\n");
                this.Task4();
            }
        }
        catch (Exception e) {
            System.out.println("\nInput is not a number.");
        }
    }
}
