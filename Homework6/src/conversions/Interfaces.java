package conversions;

import java.io.FileNotFoundException;
import java.io.IOException;

interface main_interface{
    //Display exchange table.
    void UI() throws IOException;
    //Convert sum from GEL to desired currency, return converted sum.
    String ConvertGel(double sum_gel, String currency) throws IOException;
    //Display converted sum.
    void UI(String sum_converted, double sum_original);
}