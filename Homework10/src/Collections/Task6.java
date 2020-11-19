package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task6 implements Task6_Interface{
    LinkedList<Integer> linked_list;
    ArrayList<Integer> array_list;
    Random rand;

    public Task6(){
        linked_list = new LinkedList<>();
        array_list = new ArrayList<>();
        rand = new Random();

        AddElements(false);
    }

    @Override
    public void AddElements(boolean command) {
        if(!command)
            for(int i = 0; i < 5; i++)
                linked_list.add(rand.nextInt(100)); //nextInt upper bound 100 for better readability;

        else if(command) {
            array_list.addAll(linked_list);
            linked_list.clear();

            for (int i = 0; i < array_list.size(); i++) {
                linked_list.add(array_list.get(i));
                linked_list.add(rand.nextInt(100)); //nextInt upper bound 100 for better readability;
            }
        }
    }

    @Override
    public void PrintElements() {
        String print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T6 Elements original: %s\n\n",
                print_me.substring(0, print_me.length() - 2));

        AddElements(true);
        print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T6 Elements new: %s\n\n",
                print_me.substring(0, print_me.length() - 2));
    }
}
