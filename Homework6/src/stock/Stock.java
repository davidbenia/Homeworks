package stock;

import java.io.*;
import java.util.Scanner;

public class Stock implements main_interface{
    Scanner s_input = new Scanner(System.in);
    Scanner d_input = new Scanner(System.in);
    File info_file;
    static String command;

    public Stock() throws IOException {
        if ( (new File("./src/stock.currencies/info.txt").exists()) )
            info_file = new File("./src/stock/currencies/info.txt");
        else
            info_file = new File("./src/stock/currencies/default_info.txt");
    }

    @Override
    public void UI() throws IOException{
        System.out.println("\nEdit exchange or reset? (edit; reset):");
        command = s_input.nextLine();

        if(command.equals("edit")) {
            System.out.println("\nWhich currency exchange rate to edit?:");
            String currency = s_input.nextLine();

            EditLine(currency);
        }
        else if(command.equals("reset")){
            Reset();
        }
    }

    @Override
    public void EditLine(String currency) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(info_file.getAbsolutePath()));
        BufferedWriter wr = new BufferedWriter(new FileWriter("./src/stock/currencies/info.txt"));
        String exchange_rate = "undefined", line;
        double new_rate = 0;

        while((line = rd.readLine()) != null) {
            if (line.contains(currency)) {
                exchange_rate = line.substring(4);
                System.out.format("\nCurrent %s exchange rate is: %s\n\nChange it to?:\n", currency, exchange_rate);
                new_rate = d_input.nextDouble();

                wr.write(line.substring(0, 4) + Double.toString(new_rate) + "\n");
            }
            else
                wr.write(line + "\n");
        }
        wr.close();
        rd.close();
    }

    @Override
    public void Reset() throws IOException{
        File reset_file = new File("./src/stock/currencies/info.txt");

        if(reset_file.exists()) {
            reset_file.delete();
            System.out.println("\ninfo.txt reset to default_info.txt.");
        }
        else
            System.out.println("\nCould not reset.");

    }
}
