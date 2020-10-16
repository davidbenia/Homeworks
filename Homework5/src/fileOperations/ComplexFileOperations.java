package fileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ComplexFileOperations implements Complex_Interface{
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    @Override
    public void Int_Range_Writer() throws IOException {
        int a, b, temp;
        File file = new File("src/fileOperations/myFiles/data2.txt");
        FileWriter fr = new FileWriter("src/fileOperations/myFiles/data2.txt");

        System.out.println("\nInput a:");
        a = input.nextInt();
        System.out.println("\nInput b:");
        b = input.nextInt();

        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }

        for(int i = 1; i <= 100; i++)
            fr.write(String.format("%d; ", rand.nextInt(b - a + 1) + a));

        fr.close();
    }

    @Override
    public void Float_Range_Write() throws IOException{
        int a, b, temp;

        File file = new File("src/fileOperations/myFiles/data3.txt");
        FileWriter fr = new FileWriter("src/fileOperations/myFiles/data3.txt", true);

        System.out.println("\nInput a:");
        a = input.nextInt();
        System.out.println("\nInput b:");
        b = input.nextInt();

        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }

        for(int i = 1; i <= 50; i++)
            fr.write(String.format("%.1f; ", (rand.nextInt(b - a + 1) + a) + rand.nextFloat()));

        fr.write("\n\n");
        fr.close();
    }

    @Override
    public void Function1_Calculator() throws IOException{
        File file = new File("src/fileOperations/myFiles/function.txt");
        FileWriter fr = new FileWriter("src/fileOperations/myFiles/function.txt", true);
        FileWriter clear = new FileWriter("src/fileOperations/myFiles/function.txt");
        double x, y;

        clear.write("");
        clear.close();

        fr.write("y = x^3 + e^x\n\n");

        for(int i = 0; i <= 2; i++){
            x = i;
            y = Math.pow(x, 3) + Math.exp(x);

            fr.write(String.format("x = %.0f; y = %.2f\n", x, y));
        }

        fr.close();
    }

    @Override
    public void Function2_Calculator() throws IOException{
        File file = new File("src/fileOperations/myFiles/function.txt");
        FileWriter fr = new FileWriter("src/fileOperations/myFiles/function.txt", true);
        double x, y;

        fr.write("\ny = sin(x) + e^x + 1\n\n");

        for(int i = 0; i <= 2; i++){
            x = i;
            y = Math.sin(x) + Math.exp(x) + 1;

            fr.write(String.format("x = %.0f; y = %.2f\n", x, y));
        }

        fr.close();
    }

    @Override
    public void Named_File_Writer() throws IOException{
        File file;
        FileWriter fr;

        for(int i = 1; i <= 10000; i++) {
            file = new File(String.format("src/fileOperations/myFiles/%d.txt", i));
            fr = new FileWriter(String.format("src/fileOperations/myFiles/%d.txt", i));

            fr.write(String.format("%d", i));
            fr.close();
        }
    }
}
