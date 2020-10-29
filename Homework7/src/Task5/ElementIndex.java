package Task5;

import java.util.ArrayList;
import java.util.Random;

public class ElementIndex implements Task5_Interface{
    Random rand = new Random();
    ArrayList<Integer> elements_greater = new ArrayList<>();
    int[] my_array = new int[100];
    int count_greater = 0;

    @Override
    public void RandomArray() {
        for(int i = 0; i < my_array.length; i++)
            my_array[i] = rand.nextInt(100);
    }

    @Override
    public void CompareElements() {
        String output = "";

        for(int i = 0; i < my_array.length; i++)
            if(my_array[i] > i){
                count_greater++;
                elements_greater.add(my_array[i]);
            }

        output += String.format("\nTotal elements greater than their indices = %d\nElements:\n", count_greater);
        for (int item : elements_greater) {
            output += String.format("%d i:%d\n", item, elements_greater.indexOf(item));
            elements_greater.set(elements_greater.indexOf(item), 0);
        }

        System.out.print(output);
    }
}
