package businessOperations;

import java.util.Scanner;

public class BaseConversions implements BaseConversions_Interface{
    public int my_decimal;
    public String my_binary;

    @Override
    public String Convert_Base10_Base2() {
        Scanner input = new Scanner(System.in);
        String binary = "";
        int decimal, remainder;

        System.out.println("\nInput decimal:");
        decimal = my_decimal = input.nextInt();

        while(decimal != 0){
            remainder = decimal % 2;
            decimal /= 2;
            binary += String.format("%d", remainder);
        }

        return binary;
    }

    @Override
    public int Convert_Base2_Base10() {
        Scanner input = new Scanner(System.in);
        String[] bits;
        String binary = "";
        int decimal = 0;

        System.out.println("\nInput binary:");
        binary = my_binary = input.nextLine();
        bits = binary.split("");

        for(int i = bits.length - 1; i >= 0; i--){
            decimal += (Integer.parseInt(bits[i]) * Math.pow(2, i));
        }

        return decimal;
    }
}
