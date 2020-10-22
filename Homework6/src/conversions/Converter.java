package conversions;

import java.io.*;
import java.util.Scanner;

public class Converter implements main_interface{
    Scanner d_input = new Scanner(System.in);
    Scanner s_input = new Scanner(System.in);
    String information = "";
    File info_file;

    public Converter() throws IOException {
        BufferedReader rd;
        String line;

        if ( (new File("./src/stock/currencies/info.txt").exists()) ){
            rd = new BufferedReader(new FileReader("./src/stock/currencies/info.txt"));
            info_file = new File("./src/stock/currencies/info.txt");

            while((line = rd.readLine()) != null)
                information += line + "\n";

            rd.close();
        }
        else{
            rd = new BufferedReader(new FileReader("./src/stock/currencies/default_info.txt"));
            info_file = new File("./src/stock/currencies/default_info.txt");

            while((line = rd.readLine()) != null)
                information += line + "\n";

            rd.close();
        }
    }

    @Override
    public void UI() throws IOException {
        double sum_gel;
        String currency;

        System.out.format("\nExchange table:\n\n%s\nWhat sum would you like to convert?:", information);
        sum_gel = d_input.nextDouble();
        System.out.println("\nTo which currency?:");
        currency = s_input.nextLine();

        UI(ConvertGel(sum_gel, currency), sum_gel);
    }

    @Override
    public String ConvertGel(double sum_gel, String currency) throws IOException {
        String sum_converted = "Unknown currency selected", line;
        BufferedReader rd = new BufferedReader(new FileReader(info_file.getAbsolutePath()));

        if(currency.equals("USD")){
            while((line = rd.readLine()) != null){
                if(line.contains("USD")) {
                    sum_converted = "USD " + Double.toString((sum_gel / Double.valueOf(line.substring(4))));
                    break;
                }

            }
        }
        else if(currency.equals("EUR")){
            while((line = rd.readLine()) != null) {
                if (line.contains("EUR")) {
                    sum_converted = "EUR " + Double.toString((sum_gel / Double.valueOf(line.substring(4))));
                    break;
                }
            }
        }
        else if(currency.equals("GBP")){
            while((line = rd.readLine()) != null) {
                if (line.contains("GBP")) {
                    sum_converted = "GBP " + Double.toString((sum_gel / Double.valueOf(line.substring(4))));
                    break;
                }
            }
        }

        rd.close();
        return sum_converted;
    }

    @Override
    public void UI(String sum_converted, double sum_original) {
        System.out.format("\nYour converted sum:\nGEL %s = %s", Double.toString(sum_original), sum_converted);
    }
}
