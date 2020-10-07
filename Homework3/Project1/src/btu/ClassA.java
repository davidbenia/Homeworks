package btu;

import java.util.Scanner;

public class ClassA {
    int a, b;

    public void Method1(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nInput numbers:");
        a = input.nextInt();
        b = input.nextInt();
    }

    public void Method2(){
        System.out.println("\na + b = " + (a + b));
    }

    public int Method3(){
        return a * b;
    }
}
