package btu;

import java.util.Random;
import java.util.Scanner;

public class ClassA {
    Scanner input = new Scanner(System.in);
    int x, y;

    public void Method1(){
        x = input.nextInt();
        y = input.nextInt();
    }

    public void Method2(){
        Random rand = new Random();

        x = rand.nextInt(67) + 12;
        y = rand.nextInt(67) + 12;
    }

    public void Method3(){
        System.out.println("\n" + y);
    }
}
