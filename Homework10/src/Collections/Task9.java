package Collections;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task9 implements Task9_Interface{
    LinkedList<Integer> linked_list;
    Random rand;
    Scanner input_int;
    int n;

    public Task9(){
        linked_list = new LinkedList<>();
        rand = new Random();
        input_int = new Scanner(System.in);

        System.out.println("Enter n index:");
        n = input_int.nextInt();

        if(n < 0 || n > 4) {
            n = rand.nextInt(5);
            System.out.format("Wrong input, random n = %d\n\n", n);
        }

        AddElements(false);
    }

    @Override
    public void AddElements(boolean command) {
        if(!command)
            for(int i = 0; i < 5; i++)
                linked_list.add(rand.nextInt(100)); //nextInt upper bound 100 for better readability;

        else if(command)
            linked_list.remove(n);
    }

    @Override
    public void PrintElements() {
        String print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T9 Elements original: %s\n\n",
                print_me.substring(0, print_me.length() - 2));

        AddElements(true);
        print_me = "";

        for(int element : linked_list)
            print_me += String.format("%d; ", element);

        System.out.format("T9 Elements new: %s\n\n",
                print_me.substring(0, print_me.length() - 2));
    }
}
