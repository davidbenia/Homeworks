package businessOperations;

import java.io.IOException;

interface BaseConversions_Interface{
    String Convert_Base10_Base2();
    int Convert_Base2_Base10();
}

interface PercentageCalculators_Interface{
    double SimpleInterest();
    double CompoundInterest();
}

interface NumberManipulations_Interface{
    void Range_Manipulation() throws IOException;
    void Matrix_Manipulation() throws IOException;
}