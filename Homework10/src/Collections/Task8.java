package Collections;

import java.util.LinkedList;
import java.util.Random;

public class Task8 implements Task8_Interface{
    LinkedList<Integer> linked_list;
    Random rand;

    public Task8(){
        linked_list = new LinkedList<>();
        rand = new Random();

        AddElements(false);
    }

    @Override
    public void AddElements(boolean command) {
        if(!command)
            for(int i = 0; i < 5; i++)
                linked_list.add(rand.nextInt(100)); //nextInt upper bound 100 for better readability;

        else if(command) {
            for(int i = 0; i < 3; i++)
                linked_list.removeFirst();
        }
    }

    @Override
    public void PrintElements() {
        String print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T8 Elements original: %s\n\n",
                print_me.substring(0, print_me.length() - 2));

        AddElements(true);
        print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T8 Elements new: %s\n\n",
                print_me.substring(0, print_me.length() - 2));
    }
}
