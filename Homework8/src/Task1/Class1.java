package Task1;

import java.util.Random;
import java.util.Scanner;

public class Class1 implements My_Interface{
    int[] m = new int[15];

    @Override
    public void RandomElements() {
        Random rand = new Random();
        Scanner input_int = new Scanner(System.in);
        int a, b;

        System.out.println("\nEnter a:");
        a = input_int.nextInt();
        System.out.println("\nEnter b:");
        b = input_int.nextInt();

        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        for(int i = 0; i < m.length; i++)
            m[i] = rand.nextInt(b - a + 1) - a;
    }

    @Override
    public int ValueLesserSum() {
        int sum = 0;

        for(int i = 0; i < m.length; i++)
            if(m[i] < i)
                sum += m[i];

        return sum;
    }

    @Override
    public int IndexGreaterProduct() {
        int multiple = 1;

        for(int i = 0; i < m.length; i++)
            if(m[i] > i)
                multiple *= i+1;

        return multiple;
    }

    @Override
    public void PrintEven() {
        String evens = "\nEvens: ";

        for(int i = 0; i < m.length; i++) {
            if (m[i] % 2 == 0 && m[i] > 0)
                evens += String.format("%d ", m[i]);
        }

        System.out.println(evens);
    }
}
