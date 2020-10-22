package rootfolder;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class MakeRootFolder implements Int_MakeRootFolder{
    private Scanner input = new Scanner(System.in);
    private String patch;
    private static File[] drives = File.listRoots();
    private int drive_number = 0;
    private static double GB = Math.pow(1024, 3);

    public MakeRootFolder() {
        checkRootDrives();

        System.out.println("\n\nEnter drive number:");
        drive_number = input.nextInt();
        if((drive_number < 1) || (drive_number > drives.length))
            drive_number = 1;

        patch = String.format("%s/root", String.valueOf(drives[drive_number - 1]).substring(0, 2));
        if(makeFolder(patch)){
            System.out.format("\nroot folder created at: %s\n", patch);
        }
    }

    @Override
    public void checkRootDrives() {
        System.out.println(Arrays.toString(drives));

        for(int i = 0; i < drives.length; i++) {
            System.out.format("\n%d %s %.2f ;  %.2f", (i + 1), drives[i], (drives[i].getTotalSpace() / GB), (drives[i].getUsableSpace() / GB));
        }
    }

    @Override
    public boolean makeFolder(String patch) {
        return (new File(patch).mkdir());
    }

    @Override
    public String getPatch() {
        return patch;
    }
}
