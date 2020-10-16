package btu;

import java.io.IOException;
import fileOperations.*;
import businessOperations.*;

public class Main {

    public static void main(String[] args) throws IOException {
        SimpleFileOperations obj_1 = new SimpleFileOperations();
        obj_1.Simple_Writer();
        obj_1.Range_Writer();
        obj_1.Programmer();
        obj_1.Numbered_Programmer();

        ComplexFileOperations obj_2 = new ComplexFileOperations();
        obj_2.Int_Range_Writer();
        obj_2.Float_Range_Write();
        obj_2.Function1_Calculator();
        obj_2.Function2_Calculator();
        obj_2.Named_File_Writer();

        BaseConversions obj_3 = new BaseConversions();
        String dec_to_bin = obj_3.Convert_Base10_Base2();
        System.out.format("\n%d in binary: %s\n", obj_3.my_decimal, dec_to_bin);
        int bin_to_dec = obj_3.Convert_Base2_Base10();
        System.out.format("\n%s in decimal: %d", obj_3.my_binary, bin_to_dec);

        PercentageCalculators obj_4 = new PercentageCalculators();
        System.out.format("\nTotal interest: $%.2f", obj_4.SimpleInterest());
        System.out.format("\nFuture sum: $%.2f", obj_4.CompoundInterest());

        NumberManipulations obj_5 = new NumberManipulations();
        obj_5.Range_Manipulation();
        obj_5.Matrix_Manipulation();
    }
}
