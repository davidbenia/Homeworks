package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task11 implements Task11_Interface{
    LinkedList<Integer> linked_list;
    ArrayList<Integer> array_list;
    Random rand;
    Object element;

    public Task11(){
        linked_list = new LinkedList<>();
        array_list = new ArrayList<>();
        rand = new Random();

        AddElements(false);
    }

    @Override
    public void AddElements(boolean command) {
        if(!command)
            for(int i = 0; i < 5; i++)
                linked_list.add(rand.nextInt(11) + 25); //range set to [25; 35] for better visibility of method functioning;

        else if(command) {
            array_list.addAll(linked_list);

            for(int i = 0; i < array_list.size(); i++) {
                element = array_list.get(i);

                if(element.equals(30))
                    linked_list.remove(element);
            }
        }
    }

    @Override
    public void PrintElements() {
        String print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T11 Elements original: %s\n\n",
                print_me.substring(0, print_me.length() - 2));

        AddElements(true);
        print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T11 Elements new: %s\n\n",
                print_me.substring(0, print_me.length() - 2));
    }
}
