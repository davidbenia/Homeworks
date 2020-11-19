package Collections;

import java.util.LinkedList;
import java.util.Random;

public class Task5 implements Task5_Interface{
    LinkedList<Integer> linked_list;
    Random rand;

    public Task5(int N){
        linked_list = new LinkedList<>();
        rand = new Random();

        AddElements(N);
    }

    @Override
    public void AddElements(int N) {
        for(int i = 0; i < N; i++)
            linked_list.add(rand.nextInt(100)); //nextInt upper bound 100 for better readability;
    }

    @Override
    public void PrintElements(int N) {
        String print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T5 Elements original: %s\n\n",
                print_me.substring(0, print_me.length() - 2));

        AddElements(N);
        print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T5 Elements new: %s\n\n",
                print_me.substring(0, print_me.length() - 2));
    }
}
