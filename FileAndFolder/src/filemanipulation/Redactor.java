package filemanipulation;

import java.io.*;
import java.util.Scanner;

public class Redactor implements Redactor_Interface{
    private Scanner input = new Scanner(System.in);
    private File my_file, temp_file;
    private String path, substring, new_text, line, new_line;

    public Redactor(String path) throws  IOException{
        this.path = path;

        if(checkPath(this.path)){
            BufferedReader rd = new BufferedReader(new FileReader(my_file.getAbsolutePath()));
            BufferedWriter wr_tmp = new BufferedWriter(new FileWriter(temp_file.getAbsolutePath()));
            BufferedReader rd_tmp;
            BufferedWriter wr;

            System.out.println("\nWhat to redact?(substring in file):");
            substring = input.nextLine();
            System.out.println("\nReplacement text:");
            new_text = input.nextLine();

            while((line = rd.readLine()) != null){

                if(line.contains(substring)){
                    new_line = line.substring(0, line.indexOf(substring))
                            + new_text
                            + line.substring(line.indexOf(substring) + substring.length());

                    wr_tmp.write(new_line);
                }
                else
                    wr_tmp.write(line + "\n");
            }
            rd.close();
            wr_tmp.close();

            rd_tmp = new BufferedReader(new FileReader(temp_file.getAbsolutePath()));
            wr = new BufferedWriter(new FileWriter(my_file.getAbsolutePath()));
            while((line = rd_tmp.readLine()) != null){
                wr.write(line);
            }
            rd_tmp.close();
            wr.close();

            temp_file.delete();
        }
        System.out.println("\nDone.");
    }

    @Override
    public boolean checkPath(String path) throws IOException {
        my_file = new File(path);
        temp_file = new File(path.substring(0, 8) + "tempfile.txt");
        temp_file.createNewFile();
        return my_file.exists();
    }
}
