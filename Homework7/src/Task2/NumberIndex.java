package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberIndex implements Task2_Interface{
    String[] five_numbers;

    public NumberIndex(String[] five_numbers){
        if(five_numbers.length == 5)
            this.five_numbers = five_numbers;
        else {
            System.out.println("Haven't entered five numbers.");
            System.exit(1);
        }
    }

    @Override
    public String ThreeEquals() {
        ArrayList<String> equal_numbers = new ArrayList<>();
        boolean required_size = false;

        for (String i : five_numbers) {
            for (String j : five_numbers) {
                if(i.equals(j) && equal_numbers.size() < 3)
                    equal_numbers.add(j);
            }

            if(equal_numbers.size() == 3) {
                required_size = true;
                break;
            }
            else
                equal_numbers.clear();
        }

        if(required_size){
            String indices = "Numbers and indices";
            List<String> list_indices = Arrays.asList(five_numbers);

            for (String item : five_numbers) {
                if(equal_numbers.contains(item))
                    continue;
                else {
                    indices += String.format("; %s i:%d", item, list_indices.indexOf(item));
                    list_indices.set(list_indices.indexOf(item), "null");
                }
            }

            return indices;
        }
        else
            return "NO";
    }
}
