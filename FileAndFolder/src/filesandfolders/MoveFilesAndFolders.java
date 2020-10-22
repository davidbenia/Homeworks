package filesandfolders;

import java.io.*;
import java.util.Scanner;

public class MoveFilesAndFolders implements Move_Interface{
    private Scanner input = new Scanner(System.in);
    private String path, new_path, line;
    private File to_path, from_path;

    public MoveFilesAndFolders(String path) throws IOException{
        this.path = path;

        if(checkPath(this.path)){
            System.out.format("\nMove %s to where? (new path and new name):\n", this.path.substring(8));
            new_path = String.format("%s%s/", this.path.substring(0, 8), input.nextLine());
            if(new_path.substring(8, 15).equals(this.path.substring(0, 7)))
                new_path = new_path.substring(8);

            to_path = new File(new_path);
            if(from_path.isDirectory()) {
                to_path.mkdirs();
                from_path.delete();
            }
            else if(from_path.isFile()) {
                BufferedReader rd = new BufferedReader(new FileReader(from_path.getAbsolutePath()));
                BufferedWriter wr = new BufferedWriter(new FileWriter(to_path.getAbsolutePath()));

                to_path.createNewFile();
                while((line = rd.readLine()) != null){
                    wr.write(String.format("%s\n", line));
                }
                rd.close();
                wr.close();
                from_path.delete();
            }
        }
    }

    @Override
    public boolean checkPath(String path) throws IOException {
        from_path = new File(path);
        return from_path.exists();
    }
}
