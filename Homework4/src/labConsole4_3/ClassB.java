package labConsole4_3;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class ClassB implements B_interface{
    Random rand = new Random();
    private int a, b;

    public ClassB(){
        System.out.println("\n===lc4_3_ClassB===");
    }

    @Override
    public void _a(int a) {
        if(a > 0)
            this.a = a;
    }

    @Override
    public void _b(int b) {
        if(b > 0 && ((int)Math.log10(b) + 1) == 3)
            this.b = b;
    }

    @Override
    public void Print_Randoms_Between() {
        int temp, temp_a = a, temp_b = b;

        if(b > a){
            temp = temp_a;
            temp_a = temp_b;
            temp_b = temp;
        }

        System.out.format("\nThree randoms between a and b: {%d; %d; %d}",
                (rand.nextInt(temp_a - temp_b + 1) + temp_b),
                (rand.nextInt(temp_a - temp_b + 1) + temp_b),
                (rand.nextInt(temp_a - temp_b + 1) + temp_b));
    }

    @Override
    public void Print_Var_Multiples() {
        ArrayList<Integer> multiples = new ArrayList<>();

        for(int i = 1; i < a; i++)
            if(a % i == 0)
                multiples.add(i);

        System.out.format("\nThree multiples of a: {%d; %d; %d}",
                multiples.get(rand.nextInt(multiples.size())),
                multiples.get(rand.nextInt(multiples.size())),
                multiples.get(rand.nextInt(multiples.size())));
    }

    @Override
    public void Print_DigitsToNumbers() {
        //Preparing variables
        String[] string_array = String.valueOf(b).split("");
        ArrayList<Integer> digit_array = new ArrayList<>();
        int[] temp;
        String all_numbers = "";
        int i = 0, j, temp_elem, array_size, number_length;

        do{
            digit_array.add(Integer.valueOf(string_array[i]));
            i++;
        } while(i < string_array.length);

        //Calculating
        array_size = digit_array.size();
        temp = new int[array_size];
        i = 1;

        //Formatting, ignore.
        System.out.print("{ ");

        while(i < array_size){
            if(temp[i] < i){
                if(i % 2 == 0)
                    j = 0;
                else
                    j = temp[i];

                temp_elem = digit_array.get(i);
                digit_array.set(i, digit_array.get(j));
                digit_array.set(j, temp_elem);

                temp[i]++;
                i = 1;

                for(int dig : digit_array)
                    System.out.print(dig);
                System.out.print("; ");
            }
            else if(temp[i] == i){
                temp[i] = 0;
                i++;
            }
        }

        //Formatting, ignore.
        System.out.print("}\n");
    }

    @Override
    public int Return_Max_Digit() {
        String[] digit_array = String.valueOf(b).split("");
        int max_digit = Integer.parseInt(digit_array[0]), digit;

        for (String s : digit_array) {
            digit = Integer.parseInt(s);

            if (digit > max_digit)
                max_digit = digit;
        }

        return max_digit;
    }
}
