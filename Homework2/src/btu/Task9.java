package btu;
import java.util.*;

public class Task9 {

    public void Task9(){
        double[] my_array = new double[]{15, 9, -5, 30, 64, 99, 87, 5};

        System.out.format("\n%s\nMax: %.2f\nMin: %.2f\n", Arrays.toString(my_array), maximum(my_array), minimum(my_array));
    }
    private double maximum(double[] some_array){
        double max = 0;

        for(int i = 0; i < some_array.length; i++)
            if(some_array[i] > max)
                max = some_array[i];

        return max;
    }
    private double minimum(double[] some_array){
        double min = 0;

        for(int i = 0; i < some_array.length; i++)
            if(some_array[i] < min)
                min = some_array[i];

        return min;
    }
}
