package filesandfolders;

import java.io.*;
import java.util.Scanner;

public class MakeFilesAndFolders implements Make_Interface{
    private Scanner input = new Scanner(System.in);
    private final String patch;
    private static String command;
    private String path;
    File new_item;

    public MakeFilesAndFolders(String patch) throws IOException{
        this.patch = patch;

        makeItem(this.patch);
    }

    @Override
    public void makeItem(String patch) throws IOException{
        System.out.println("\nCreate file or directory? (file; directory):");
        command = input.nextLine();

        System.out.println("\nEnter file/directory path(including file name if making a file):");
        path = input.nextLine();
        if(patch.equals(path.substring(0, 7)))
            path = path.substring(8);

        new_item = new File(String.format("%s/%s", patch, path));
        if(command.equals("file"))
            new_item.createNewFile();
        else if(command.equals("directory"))
            new_item.mkdirs();
    }
}
