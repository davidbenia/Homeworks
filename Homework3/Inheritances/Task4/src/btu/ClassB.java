package btu;

import java.util.Random;

public class ClassB extends ClassA{
    double a, b;

    public void Method4(){
        a = input.nextDouble();
        b = input.nextDouble();
    }

    public void Method5(){
        double temp = a;

        if(a > b)
            a = b;
            b = temp;
    }

    public void Method6(){
        Random rand = new Random();

        if(a > b)
            x = rand.nextDouble() * ((a - b + 1) + b);
        else
            x = rand.nextDouble() * ((b - a + 1) + a);
    }
}
