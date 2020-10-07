package btu;

import java.util.Scanner;

public class ClassC {
    int a, b, c;

    public void Method1(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nInput numbers:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }

    public int Method2(){
        return a % 10;
    }

    public int Method3(){
        int temp = b;

        while(temp >= 10)
            temp /= 10;

        return temp;
    }

    public int Method4(){
        int temp = c;
        int sum = 0;

        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }

        return sum;
    }

    public int Method5(){
        int product = this.Method2() * this.Method3();

        System.out.println("\nMethod2() * Method3() = " + product);

        return product;
    }

    public void Method6(){
        System.out.println("\nMethod4() + Method5() = " + (this.Method4() + this.Method5()));
    }
}
