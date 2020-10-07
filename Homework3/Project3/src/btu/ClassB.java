package btu;

import java.util.Random;
import java.util.Scanner;

public class ClassB {
    Scanner input = new Scanner(System.in);
    double[] m = new double[12];

    public void Method1(){
        System.out.println("\nInput 12 numbers...");

        for(int i = 0; i < m.length; i++){
            System.out.format("Number %d:\n", (i + 1));
            m[i] = input.nextInt();
        }
    }

    public void Method2(){
        Random rand = new Random();
        for(int i = 0; i < m.length; i++)
            m[i] = rand.nextDouble() * 15;
    }

    public void Method3(){
        double[] specials = new double[m.length];
        int[] indices = new int[m.length];
        int counter = 0;

        for(int i = 0; i < m.length; i++)
            if(m[i] > 7) {
                specials[counter] = m[i];
                indices[counter] = i;
                counter++;
            }

        System.out.format("\nElement: %.1f, index: %d", specials[0], indices[0]);
        for(int i = 1; i < specials.length; i++)
            if(indices[i] > 0)
                System.out.format("\nElement: %.1f, index: %d", specials[i], indices[i]);
    }

    public double Method4(){
        double min = m[0], max = m[0];

        for(int i = 1; i < m.length; i++)
            if(m[i] < min)
                min = m[i];

        for(int i = 1; i < m.length; i++)
            if(m[i] > max)
                max = m[i];

        return max - min;
    }
}
