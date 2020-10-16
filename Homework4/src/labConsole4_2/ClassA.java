package labConsole4_2;

import java.util.ArrayList;
import java.util.Random;

public class ClassA implements A_interface{
    Random rand = new Random();
    private int a, b;
    private int[] m = new int[12];

    public ClassA(){
        System.out.println("\n===lc4_2_ClassA===");
    }

    @Override
    public void Assign_Var_Random() {
        a = rand.nextInt(16) + 10;
        b = rand.nextInt(16) + 10;

        //Printing to check for myself
        System.out.format("\nAssigned: a = %d; b = %d", a, b);
    }

    @Override
    public int[] Return_Var_Values() {
        return new int[]{a, b};
    }

    @Override
    public ArrayList<String> Return_Var_Chars() {
        ArrayList<String> values = new ArrayList<>();

        values.add(Character.getName((char)a));
        values.add(Character.getName((char)b));

        return values;
    }

    @Override
    public void Assign_Array_Random() {
        for(int i = 0; i < m.length; i++)
            m[i] = rand.nextInt(71) - 10;
    }

    @Override
    public void Print_Array_Even() {
        String elements = "";

        for (int i : m) {
            if (i % 2 == 0)
                elements += String.format("%d; ", i);
        }

        System.out.format("\nEven elements: {%s}", elements);
    }

    @Override
    public void Print_Array_PositiveSum() {
        String elements = "";

        for (int i : m) {
            if (i > 0)
                elements += String.format("%d; ", i);
        }

        System.out.format("\nPositive elements: {%s}", elements);
    }

    @Override
    public void Print_Array_MinPositive() {
        int min = 61;
        String val;

        for (int i : m) {
            if (i > 0 && i < min)
                min = i;
        }

        if(min == 61)
            val = "Not Found.";
        else
            val = String.valueOf(min);

        System.out.format("\nMinimum positive element: %s\n", val);
    }
}
