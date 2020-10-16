package fileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileOperations implements Simple_Interface{
    @Override
    public void Simple_Writer() throws IOException {
        File file = new File("src/fileOperations/myFiles/data.txt");
        FileWriter fr = new FileWriter("src/fileOperations/myFiles/data.txt");

        fr.write(String.format("%d; %d; %d\n", 24, 39, -90));
        fr.close();
    }

    @Override
    public void Range_Writer() throws IOException{
        File file = new File("src/fileOperations/myFiles/data1.txt");
        FileWriter fr = new FileWriter("src/fileOperations/myFiles/data1.txt");

        for(int i = 0; i < 100; i++)
            fr.write(String.format("%d; ", i));

        fr.close();
    }

    @Override
    public void Programmer() throws IOException{
        File file;
        FileWriter fr;

        for(int i = 1; i <= 30; i++) {
            file = new File(String.format("src/fileOperations/myFiles1/file%d.txt", i));
            fr = new FileWriter(String.format("src/fileOperations/myFiles1/file%d.txt", i));

            fr.write("Programmer");
            fr.close();
        }
    }

    @Override
    public void Numbered_Programmer() throws IOException{
        File file;
        FileWriter fr;

        for(int i = 1; i <= 30; i++) {
            file = new File(String.format("src/fileOperations/myFiles2/file%d.txt", i));
            fr = new FileWriter(String.format("src/fileOperations/myFiles2/file%d.txt", i));

            fr.write(String.format("Programmer%d", i));
            fr.close();
        }
    }
}
