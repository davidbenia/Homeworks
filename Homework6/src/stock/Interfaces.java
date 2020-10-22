package stock;

import java.io.FileNotFoundException;
import java.io.IOException;

interface main_interface{
    void UI() throws IOException;
    void EditLine(String currency) throws IOException;
    void Reset() throws IOException;
}