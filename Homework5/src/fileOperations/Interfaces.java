package fileOperations;

import java.io.IOException;

interface Simple_Interface{
    void Simple_Writer() throws IOException;
    void Range_Writer() throws IOException;
    void Programmer() throws IOException;
    void Numbered_Programmer() throws IOException;
}

interface Complex_Interface{
    void Int_Range_Writer() throws IOException;
    void Float_Range_Write() throws IOException;
    void Function1_Calculator() throws IOException;
    void Function2_Calculator() throws IOException;
    void Named_File_Writer() throws IOException;
}