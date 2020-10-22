package filemanipulation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer implements Writer_Interface{
    private Scanner input = new Scanner(System.in);
    private File my_file;
    private String path, text;
    private boolean append;

    public Writer(String path) throws IOException{
        this.path = path;

        if(checkPath(this.path)){
            BufferedWriter wr;

            System.out.println("\nOverwrite or Append? (overwrite; append)");
            if(String.format("%s", input.nextLine()).equals("append"))
                append = true;

            System.out.println("\nWrite your text:\n");
            text = input.nextLine();

            if(append)
                wr = new BufferedWriter(new FileWriter(this.path, true));
            else
                wr = new BufferedWriter(new FileWriter(this.path));

            wr.write("\n" + text);
            wr.close();

            System.out.println("\nDone.");
        }
    }

    @Override
    public boolean checkPath(String path) throws IOException {
        my_file = new File(path);
        return my_file.exists();
    }
}
