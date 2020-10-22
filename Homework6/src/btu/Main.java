package btu;

import conversions.*;
import stock.*;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String command;
    static Converter my_converter;
    static Stock my_stock;

    public static void main(String[] args) throws IOException {
        System.out.println("\nWhich program to run?(converter; edit_stock):");
        command = input.nextLine();

        if(command.equals("converter")){
            my_converter = new Converter();
            my_converter.UI();
        }
        else if(command.equals("edit_stock")){
            my_stock = new Stock();
            my_stock.UI();
        }
    }
}
