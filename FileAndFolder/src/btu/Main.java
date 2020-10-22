package btu;

import rootfolder.MakeRootFolder;
import filesandfolders.MakeFilesAndFolders;
import filesandfolders.MoveFilesAndFolders;
import filemanipulation.Writer;
import filemanipulation.Redactor;
import java.io.IOException;;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static String patch, path, make_or_move, redact_not;

    public static void main(String[] args) throws IOException {
        MakeRootFolder makeRootFolder = new MakeRootFolder();
        patch = makeRootFolder.getPatch();

        System.out.println("\nCreate or move items? (create; move; none):");
        make_or_move = input.nextLine();

        if(make_or_move.equals("create")){
            new MakeFilesAndFolders(patch);
        }
        else if(make_or_move.equals("move")){
            System.out.format("\nMove what? (path of item in %s/):\n", patch);
            path = String.format("%s/%s", patch, input.nextLine());
            new MoveFilesAndFolders(path);
        }

        System.out.println("\nEdit files? (yes; no):");
        redact_not = input.nextLine();

        if(redact_not.equals("yes")){
            System.out.println("\nWrite or redact? (write; redact):");
            String w_r = input.nextLine();

            if(w_r.equals("write")){
                System.out.format("\nWrite in what? (path of item in %s/):\n", patch);
                path = String.format("%s/%s", patch, input.nextLine());
                new Writer(path);
            }
            else if(w_r.equals("redact")){
                System.out.format("\nRedact what? (path of item in %s/):\n", patch);
                path = String.format("%s/%s", patch, input.nextLine());
                new Redactor(path);
            }
        }
        else if(redact_not.equals("no"))
            System.out.println("\nProgram successfully finished.");
    }
}
