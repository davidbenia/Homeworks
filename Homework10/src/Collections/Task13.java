package Collections;

import java.util.LinkedList;
import java.util.Random;

public class Task13 implements Task13_Interface{
    LinkedList<String> linked_list_1;
    LinkedList<String> linked_list_2;
    String random_string;
    Random rand;

    public Task13(){
        linked_list_1 = new LinkedList<>();
        linked_list_2 = new LinkedList<>();
        rand = new Random();

        AddElements(false);
    }

    @Override
    public void AddElements(boolean command) {
        if(!command)
            for(int i = 0; i < 20; i++) {
                random_string = "";

                for(int j = 0; j < 10; j++)
                    random_string += (char)(rand.nextInt(95) + 32); //range for decimal values of every alphanumeric ASCII element.

                linked_list_1.add(random_string);
            }

        else if(command) {
            for(String element : linked_list_1)
                if(element.contains("x") || element.contains("X"))
                    linked_list_2.add(element);
        }
    }

    @Override
    public void PrintElements() {
        String print_me = "";

        for(String element : linked_list_1)
            print_me += String.format("%s  ", element);

        System.out.format("T13 Elements original:  %s\n\n",
                print_me.substring(0, print_me.length() - 2));

        AddElements(true);
        print_me = "";

        for(String element : linked_list_2)
            print_me += String.format("%s  ", element);

        System.out.format("T13 Elements containing x:  %s\n\n",
                print_me.substring(0, print_me.length() - 2));
    }
}
