package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Task12 implements Task12_Interface{
    LinkedList<Integer> linked_list_1;
    LinkedList<Integer> linked_list_2;
    Random rand;

    public Task12(){
        linked_list_1 = new LinkedList<>();
        linked_list_2 = new LinkedList<>();
        rand = new Random();

        AddElements(false);
    }

    @Override
    public void AddElements(boolean command) {
        if(!command)
            for(int i = 0; i < 20; i++)
                linked_list_1.add(rand.nextInt(100)); //nextInt upper bound 100 for better readability;

        else if(command) {
            for(int i = 7; i < 15; i++)
                linked_list_2.add(linked_list_1.get(i));
        }
    }

    @Override
    public void PrintElements() {
        String print_me = "";

        for(int element : linked_list_1)
            print_me += String.format("%d; ", element);

        System.out.format("T12 Elements original: %s\n\n",
                print_me.substring(0, print_me.length() - 2));

        AddElements(true);
        print_me = "";

        for(int element : linked_list_2)
            print_me += String.format("%d; ", element);

        System.out.format("T12 Elements i:[7;14]: %s\n\n",
                print_me.substring(0, print_me.length() - 2));
    }
}
