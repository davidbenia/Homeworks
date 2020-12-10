package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Task3 implements Task3_Interface{
    LinkedList<Integer> linked_list;
    Random rand;

    public Task3(){
        linked_list = new LinkedList<>();
        rand = new Random();

        AddElements();
    }

    @Override
    public void AddElements() {
        for(int i = 0; i < 5; i++)
            linked_list.add(rand.nextInt(100)); //nextInt upper bound 100 for better readability;

        Collections.sort(linked_list);
    }

    @Override
    public void PrintElements() {
        String print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T3 Elements ascending order: %s\n\n",
                print_me.substring(0, print_me.length() - 2));
    }
}