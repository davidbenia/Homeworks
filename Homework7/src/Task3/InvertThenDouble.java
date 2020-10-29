package Task3;

public class InvertThenDouble implements Task3_Interface{

    @Override
    public int InvertDigits(int number) {
        number = Math.abs(number);
        String[] digits = (Integer.toString(number)).split("");
        String[] inverted_number = new String[digits.length];

        int i = 0, reversed_i = digits.length - 1;
        for (String digit : digits) {
            inverted_number[i] = digits[reversed_i];
            i++;
            reversed_i--;
        }

        return ITD(inverted_number);
    }

    @Override
    public int ITD(String[] inverted_number) {
        String ITD_number = "";

        for (String digit : inverted_number) {
            ITD_number += String.valueOf(Integer.parseInt(digit) * 2);
        }

        return Integer.parseInt(ITD_number);
    }
}
