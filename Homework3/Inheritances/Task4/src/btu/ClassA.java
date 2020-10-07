package btu;

import java.util.Random;
import java.util.Scanner;

public class ClassA {
    Scanner input = new Scanner(System.in);
    double x, y;

    public void Method1(){
        x = input.nextDouble();
        y = input.nextDouble();
    }

    public void Method2(){
        Random rand = new Random();

        x = rand.nextDouble() * 12;
        y = rand.nextDouble() * 12;
    }

    public void Method3(){
        System.out.println("\n" + ((y - (3 * x)) / 3));
    }
}
