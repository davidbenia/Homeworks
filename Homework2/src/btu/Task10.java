package btu;
import java.util.*;

public class Task10 {

    public void Task10(){
        double[] my_array = new double[]{15, 9, -5, 30, 64, 99, 87, 5};
        System.out.format("\n%s", Arrays.toString(my_array));

        double next_elem = 0;
        for(int i = 0; i < my_array.length; i++)
            for(int j = i + 1; j < my_array.length; j++)
                if(my_array[i] > my_array[j]){
                    next_elem = my_array[i];
                    my_array[i] = my_array[j];
                    my_array[j] = next_elem;
                }
        System.out.format("\n%s", Arrays.toString(my_array));
    }
}
