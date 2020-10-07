package btu;

import java.util.Random;
import java.util.Scanner;

public class ClassA {
    Scanner input = new Scanner(System.in);
    int[] m = new int[10];

    public void Method1(){
        System.out.println("\nInput 10 numbers...");

        for(int i = 0; i < m.length; i++){
            System.out.format("Number %d:\n", (i + 1));
            m[i] = input.nextInt();
        }
    }

    public void Method2(){
        Random rand = new Random();
        for(int i = 0; i < m.length; i++)
            m[i] = rand.nextInt(16);
    }

    public int Method3(){
        int[] lessers = new int[m.length];
        int sum = 0;

        for(int i = 0; i < m.length; i++)
            if(m[i] < i)
                lessers[i] = m[i];

        for(int i =0; i < lessers.length; i++)
            sum += lessers[i];

        return sum;
    }

    public int Method4(){
        int[] greaters = new int[m.length];
        int counter = 0, sum = 1;

        for(int i = 0; i < m.length; i++)
            if (m[i] > i) {
                greaters[counter] = i;
                counter++;
            }

        for(int i =0; i < greaters.length; i++)
            if(greaters[i] != 0)
                sum *= greaters[i];

        return sum;
    }
}
