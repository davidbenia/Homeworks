package btu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //============= labConsole4_1 =============
        labConsole4_1.ClassA obj_1 = new labConsole4_1.ClassA();

        obj_1.Hello_OPP();
        obj_1.Print_Var1();
        obj_1.Print_Var2();
        obj_1.Print_Var_Sum();
        System.out.format("\nReturned: a + b = %d\nReturned: a * b = %d", obj_1.Return_Var_Sum(), obj_1.Return_Var_Product());
        obj_1.Assign_Var_Values();

        labConsole4_1.ClassB obj_2 = new labConsole4_1.ClassB();

        obj_2.Print_CharVar();
        obj_2.Print_IntVar();
        obj_2.Print_FloatVar();
        obj_2.Print_Var_Difference();
        System.out.format("\nReturned: a / b = %.1f", obj_2.Return_Var_Quotient());
        obj_2.Assign_Var_Values();
        obj_2.Input_Var_Value();
        obj_2.Print_MoreThan();

        labConsole4_1.ClassC obj_3 = new labConsole4_1.ClassC();

        obj_3.Print_IntVar();
        obj_3.Print_CharVar();
        obj_3.Print_Var_Operations();
        obj_3.Input_Var1_Value();
        obj_3.Input_Var2_Value();
        obj_3.Input_Char_Values();

        //============= labConsole4_2 =============
        labConsole4_2.ClassA obj_4 = new labConsole4_2.ClassA();
        int[] ints;
        ArrayList<String> chars;

        obj_4.Assign_Var_Random();
        ints = obj_4.Return_Var_Values();
        System.out.format("\nReturned: a = %d; b = %d", ints[0], ints[1]);
        chars = obj_4.Return_Var_Chars();
        System.out.format("\nReturned: Ascii %d = %s; Ascii %d = %s", ints[0], chars.get(0), ints[1], chars.get(1));
        obj_4.Assign_Array_Random();
        obj_4.Print_Array_Even();
        obj_4.Print_Array_PositiveSum();
        obj_4.Print_Array_MinPositive();

        //============= labConsole4_3 =============
        Scanner input = new Scanner(System.in);
        labConsole4_3.ClassA obj_5 = new labConsole4_3.ClassA();

        System.out.println("\nInput a:");
        obj_5.set_a(input.nextInt());
        System.out.println("\nInput b:");
        obj_5.set_b(input.nextInt());
        obj_5.Print_Between();
        obj_5.Print_Divisors();
        obj_5.Print_PrimeFactors();
        System.out.format("\nMost common digit of b: %d\n", obj_5.Return_Common_Digit());

        labConsole4_3.ClassB obj_6 = new labConsole4_3.ClassB();

        System.out.println("\nInput a:");
        obj_6._a(input.nextInt());
        System.out.println("\nInput b:");
        obj_6._b(input.nextInt());
        obj_6.Print_Randoms_Between();
        obj_6.Print_Var_Multiples();
        System.out.print("\nPermutations of b digits: ");
        obj_6.Print_DigitsToNumbers();
        System.out.format("Max digit of b: %d", obj_6.Return_Max_Digit());
    }
}
