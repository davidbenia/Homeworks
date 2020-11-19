package Collections;

import java.util.LinkedList;
import java.util.Random;

public class Task1 implements Task1_Interface{
    LinkedList<Integer> linked_list;
    Random rand;

    public Task1(){
        linked_list = new LinkedList<>();
        rand = new Random();

        AddElements();
    }

    @Override
    public void AddElements() {
        for(int i = 0; i < 5; i++)
            linked_list.add(rand.nextInt(100)); //nextInt upper bound 100 for better readability;
    }

    @Override
    public void PrintElements() {
        String print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T1 Elements: %s\n\n",
                print_me.substring(0, print_me.length() - 2));
    }
}
