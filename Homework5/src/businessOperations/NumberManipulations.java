package businessOperations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberManipulations implements NumberManipulations_Interface{
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    @Override
    public void Range_Manipulation() throws IOException {
        File file = new File("src/businessOperations/numbers.txt");
        FileWriter fr = new FileWriter("src/businessOperations/numbers.txt");
        FileWriter fr_a = new FileWriter("src/businessOperations/numbers2.txt", true);
        FileReader rd = new FileReader("src/businessOperations/numbers.txt");
        int a, b, temp, char_code, int_num, evens = 0, odds = 0, sum_odd = 0, sum_even = 0;
        ArrayList<String> five_nums = new ArrayList<>();
        String line = "";
        String[] numbers;

        System.out.println("\nInput a:");
        a = input.nextInt();
        System.out.println("\nInput b:");
        b = input.nextInt();
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if(b - a < 40)
            b += (40 - (b - a));

        for(int i = a; i <= 40; i++){
            fr.write(String.format("%d ", i));
        }
        fr.close();

        while((char_code = rd.read()) != -1){
            line += String.valueOf((char)char_code);
        }
        rd.close();

        numbers = line.split(" ");
        for(int i = 0; i < numbers.length; i++) {
            int_num = Integer.parseInt(numbers[i]);

            if(int_num % 2 == 0) {
                sum_even += int_num;
                evens++;
            }
            else {
                sum_odd += int_num;
                odds++;
            }
        }

        int temp_more, temp_less;
        if(sum_even > sum_odd){
            temp_more = sum_even;
            temp_less = sum_odd;
        }
        else if(sum_odd > sum_even){
            temp_more = sum_odd;
            temp_less = sum_even;
        }
        else {
            temp_more = temp_less = sum_even;
        }

        String my_format;
        for(int i = 0; i < 5; i++){
            my_format = String.format("%d; ", (rand.nextInt(temp_more - temp_less + 1) + temp_less));
            five_nums.add(my_format);
            fr_a.write(String.format("%s", my_format));
        }
        fr_a.write("\n\n");
        fr_a.close();

        System.out.format("\nEvens: %d; Odds: %d\nEven Sum: %d; Odd Sum: %d\n5 Five randoms: {%s}",
                evens, odds, sum_even, sum_odd, five_nums);
    }

    @Override
    public void Matrix_Manipulation() throws IOException{
        File file = new File("src/businessOperations/info.txt");
        FileWriter fr = new FileWriter("src/businessOperations/info.txt");
        FileReader rd = new FileReader("src/businessOperations/info.txt");
        int m, n, one_count = 0, zero_count = 0;

        System.out.println("\nInput m:");
        m = Math.abs(input.nextInt());
        System.out.println("\nInput n:");
        n = Math.abs(input.nextInt());
        if(m > 50)
            m = 50;
        if(n > 50)
            n = 50;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                fr.write(String.format("%d ", rand.nextInt(2)));
            }
            fr.write("\n");
        }
        fr.close();

        int my_char;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                my_char = (char)rd.read();

                if(my_char == 49)
                    one_count++;
                else if(my_char == 48)
                    zero_count++;
            }
        }
        rd.close();

        System.out.format("\nOnes: %d; Zeros: %d", one_count, zero_count);
    }
}
