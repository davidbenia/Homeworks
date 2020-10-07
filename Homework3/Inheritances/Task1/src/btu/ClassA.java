package btu;

import java.util.Scanner;

public class ClassA {
    Scanner input = new Scanner(System.in);
    int x;

    public ClassA(){
        System.out.println("hello ClassA");
    }

    public void Method1(){
        x = input.nextInt();
    }

    public void Method2(){
        System.out.println("\nx = " + x);
    }

    public void Method3(){
        if(this.x % 2 == 0)
            System.out.println("\nx is even");
        else
            System.out.println("\nx is odd");
    }
}
