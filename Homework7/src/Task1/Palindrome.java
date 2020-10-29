package Task1;

public class Palindrome implements Task1_Interface{

    @Override
    public String IsPalindrome(int number) {
        String[] digits = (Integer.toString(number)).split("");
        int indices_amount = digits.length - 1;

        for(int index = 0; index < digits.length; index++){
            if (digits[index].equals(digits[indices_amount - index]))
                continue;
            else
                return String.format("%d is not a palindrome.", number);
        }

        return String.format("%d is a palindrome.", number);
    }
}