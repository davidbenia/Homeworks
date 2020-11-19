package RadixConversions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RadixConverter implements Converter_Interface{
    Scanner input_int = new Scanner(System.in);
    Scanner input_line = new Scanner(System.in);
    public String binary_number;
    public int public_decimal;
    int decimal_number;

    @Override
    public String DecimalToBinary() {
        ArrayList<String> bits = new ArrayList<>();
        binary_number = "";

        System.out.println("Enter decimal number:");
        decimal_number = public_decimal = input_int.nextInt();

        while(decimal_number != 0){
            bits.add(String.valueOf(decimal_number % 2));
            decimal_number /= 2;
        }
        Collections.reverse(bits);

        for(String element : bits)
            binary_number += element;

        return binary_number;
    }

    @Override
    public int BinaryToDecimal() {
        ArrayList<Integer> bits = new ArrayList<>();

        System.out.println("Enter binary number:");
        binary_number = input_line.nextLine();

        for(String bit : binary_number.split(""))
            bits.add(Integer.parseInt(bit));

        Collections.reverse(bits);
        for(int i = 0; i < bits.size(); i++){
            decimal_number += (bits.get(i) * Math.pow(2, i));
        }

        return decimal_number;
    }
}
