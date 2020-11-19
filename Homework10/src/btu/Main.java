package btu;

import Collections.*;
import RadixConversions.*;

public class Main {

    public static void main(String[] args) {
        Task1 object_1 = new Task1();
        object_1.PrintElements();

        Task2 object_2 = new Task2();
        object_2.PrintElements();

        Task3 object_3 = new Task3();
        object_3.PrintElements();

        Task4 object_4 = new Task4();
        object_4.PrintElements();

        Task5 object_5 = new Task5(5);
        object_5.PrintElements(3);

        Task6 object_6 = new Task6();
        object_6.PrintElements();

        Task7 object_7 = new Task7();
        object_7.PrintElements();

        Task8 object_8 = new Task8();
        object_8.PrintElements();

        Task9 object_9 = new Task9();
        object_9.PrintElements();

        Task10 object_10 = new Task10();
        object_10.PrintElements();

        Task11 object_11 = new Task11();
        object_11.PrintElements();

        Task12 object_12 = new Task12();
        object_12.PrintElements();

        Task13 object_13 = new Task13();
        object_13.PrintElements();

        RadixConverter object_14 = new RadixConverter();
        String bin = object_14.DecimalToBinary();
        System.out.format("%d in binary: %s\n\n", object_14.public_decimal, bin);

        RadixConverter object_15 = new RadixConverter();
        int dec = object_15.BinaryToDecimal();
        System.out.format("%s in decimal: %d\n\n", object_14.binary_number, dec);
    }
}
