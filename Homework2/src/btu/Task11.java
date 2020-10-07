package btu;
import java.util.*;

public class Task11 {

    public void Task11(){
        double[] my_array = new double[8];

        for(int i = 0; i < my_array.length; i++)
            my_array[i] = Math.random();

        System.out.format("\n%s", Arrays.toString(my_array));
    }
}
