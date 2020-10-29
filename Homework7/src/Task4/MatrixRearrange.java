package Task4;

import java.util.*;

public class MatrixRearrange implements Task4_Interface{
    Scanner input_int = new Scanner(System.in);
    Random rand = new Random();
    int a, b;
    double[][] my_array = new double[6][5];
    double[][] rearranged_array = new double[6][5];
    Double[] column = new Double[5];

    public MatrixRearrange(){
        System.out.println("\nEnter a:");
        a = Math.abs(input_int.nextInt());
        System.out.println("Enter b:");
        b = Math.abs(input_int.nextInt());

        if(a > b){
            int temp = b;
            b = a;
            a = temp;
        }
    }

    @Override
    public void RearrangeArrays() {
        int next_random;
        for(int i = 0; i < my_array.length; i++) {
            for (int j = 0; j < my_array[i].length; j++) {
                next_random = (rand.nextInt(b - a + 1) + a);
                my_array[i][j] = next_random;
                rearranged_array[i][j] = next_random;
            }
        }

        //Sorting first column
        for(int j = 0; j < my_array[0].length; j++)
            column[j] = my_array[0][j];
        Arrays.sort(column, Collections.reverseOrder());
        for(int j = 0; j < rearranged_array[0].length; j++){
            rearranged_array[0][j] = column[j];
        }

        int col;
        for(int i = 0; i < rearranged_array.length; i++){
            for(int j = 0; j < rearranged_array[i].length; j++){
                column[j] = rearranged_array[i][j];
            }
            Arrays.sort(column, Collections.reverseOrder());
            col = 0;
            for (double j : column) {
                rearranged_array[i][col] = j;
                col++;
            }
        }
    }

    @Override
    public void PrintArrays() {
        String print_my_array = "";
        String print_rearranged_array = "";

        for(int i = 0; i < my_array.length; i++) {
            for (int j = 0; j < my_array[i].length; j++)
                print_my_array += String.format("[%.0f] ", my_array[i][j]);
            print_my_array += "\n";
        }

        for(int i = 0; i < rearranged_array.length; i++) {
            for (int j = 0; j < rearranged_array[i].length; j++)
                print_rearranged_array += String.format("[%.0f] ", rearranged_array[i][j]);
            print_rearranged_array += "\n";
        }

        System.out.format("\nmy_array:\n%s\nrearranged_array:\n%s\n", print_my_array, print_rearranged_array);
    }
}
