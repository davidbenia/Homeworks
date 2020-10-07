package btu;
import java.util.*;

public class Task12 {

    public void Task12(){
        int[] my_array = new int[8];
        Random random = new Random();

        for(int i = 0; i < my_array.length; i++)
            my_array[i] = random.nextInt();

        int next_elem = 0;
        for(int i = 0; i < my_array.length; i++)
            for(int j = i + 1; j < my_array.length; j++)
                if(my_array[i] < my_array[j]){
                    next_elem = my_array[i];
                    my_array[i] = my_array[j];
                    my_array[j] = next_elem;
                }

        System.out.format("\n%s", Arrays.toString(my_array));
    }
}
