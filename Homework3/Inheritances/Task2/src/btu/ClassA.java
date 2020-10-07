package btu;

import java.util.Scanner;

public class ClassA {
    Scanner input = new Scanner(System.in);
    int x, y;

    public void Method1(){
        x = input.nextInt();
        y = input.nextInt();
    }

    public void Method2(){
        System.out.println("\nx = " + x);
    }

    public void Method3(){
        System.out.println("\ny = " + y);
    }
}
