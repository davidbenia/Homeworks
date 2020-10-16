package labConsole4_1;

import java.util.Random;
import java.util.Scanner;

public class ClassB implements B_Interface{
    private int a = 33;
    private float b = 9.7f;
    private char s = 35;

    public ClassB(){
        System.out.println("\n===lc4_1_ClassB===");
    }

    @Override
    public void Print_CharVar() {
        System.out.format("\ns = '%c'", s);
    }

    @Override
    public void Print_IntVar() {
        System.out.format("\na = %d", a);
    }

    @Override
    public void Print_FloatVar() {
        System.out.format("\nb = %.1f", b);
    }

    @Override
    public void Print_Var_Difference() {
        System.out.format("\na - b = %.1f", (a - b));
    }

    @Override
    public float Return_Var_Quotient() {
        return (a / b);
    }

    @Override
    public void Assign_Var_Values() {
        Random rand = new Random();
        boolean switch_range;

        a = rand.nextInt(101);
        b = rand.nextFloat() + rand.nextInt(101);;
        switch_range = rand.nextBoolean();

        if (switch_range)
            s = (char)(rand.nextInt(15) + 33);
        else
            s = (char)(rand.nextInt(69) + 58);

        //Printing to check for myself
        System.out.format("\nAssigned: a = %d; b = %.1f; s = '%c'", a, b, s);
    }

    @Override
    public void Input_Var_Value() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nInput integer:");
        a = input.nextInt();

        //Printing to check for myself
        System.out.format("\nInputted: a = %d", a);
    }

    @Override
    public void Print_MoreThan() {
        System.out.format("\nb + 10 = %.1f\n", (b + 10));
    }
}
