package labConsole4_1;

import java.util.Scanner;

public class ClassC implements C_Interface{
    Scanner input = new Scanner(System.in);
    private int a = 10, b = 9;
    private char s = 35, h = 64;

    public ClassC(){
        System.out.println("\n===lc4_1_ClassC===");
    }

    @Override
    public void Print_IntVar() {
        System.out.format("\na = %d; b = %d", a, b);
    }

    @Override
    public void Print_CharVar() {
        System.out.format("\ns = '%c'; h = '%c'", s, h);
    }

    @Override
    public void Print_Var_Operations() {
        int op_sum = (a + b), op_product = (a * b), op_difference = (a - b), op_remainder = (a % b);
        char percent = 37;//Display '%' symbol in formatted output.

        System.out.format("\na + b = %d\na * b = %d\na - b = %d\na %c b = %d", op_sum, op_product, op_difference, percent, op_remainder);
    }

    @Override
    public void Input_Var1_Value() {
        System.out.println("\nInput integer:");
        a = input.nextInt();

        //Printing to check for myself
        System.out.format("\nInputted: a = %d", a);
    }

    @Override
    public void Input_Var2_Value() {
        System.out.println("\nInput integer:");
        b = input.nextInt();

        //Printing to check for myself
        System.out.format("\nInputted: b = %d", b);
    }

    @Override
    public void Input_Char_Values() {
        System.out.println("\nInput char:");
        s = input.next().charAt(0);
        System.out.println("\nInput char:");
        h = input.next().charAt(0);

        //Printing to check for myself
        System.out.format("\nInputted: s = '%c'; h = '%c'\n", s, h);
    }
}
