package labConsole4_3;

public class ClassA implements A_interface{
    private int a, b;

    public ClassA(){
        System.out.println("\n===lc4_3_ClassA===");
    }

    @Override
    public void set_a(int a){
        this.a = a;
    }

    @Override
    public void set_b(int b){
        this.b = b;
    }

    @Override
    public void Print_Between() {
        int temp, temp_a = a, temp_b = b;
        String numbers_between = "";

        if(b > a){
            temp = temp_a;
            temp_a = temp_b;
            temp_b = temp;
        }

        for(int i = a; i < b; i ++)
            numbers_between += String.format("%d; ", i);

        System.out.format("\nRange from %d to %d: {%s}", a, b, numbers_between);
    }

    @Override
    public void Print_Divisors() {
        String divisors = "";

        for(int i = 1; i < a; i++)
            if(a % i == 0)
                divisors += String.format("%d; ", i);

        System.out.format("\nDivisors of %d: {%s}", a, divisors);
    }

    @Override
    public void Print_PrimeFactors() {
        String prime_factors = "";
        int temp = b;

        for(int i = 2; i < temp; i++)
            while(temp % i == 0){
                prime_factors += String.format("%d; ", i);
                temp /= i;
            }

        if(temp > 2)
            prime_factors += String.format("%d; ", temp);

        System.out.format("\nPrime factors of %d: {%s}", b, prime_factors);
    }

    @Override
    public int Return_Common_Digit() {
        String[] digit_array = String.valueOf(b).split("");
        String digit = "";
        int most_common = Integer.parseInt(digit_array[0]), previous_count = 1, current_count;

        for (String s : digit_array) {
            digit = s;
            current_count = 0;

            for (int j = 1; j < digit_array.length; j++)
                if (digit.equals(digit_array[j]))
                    current_count++;

            if (current_count > previous_count) {
                previous_count = current_count;
                most_common = Integer.parseInt(digit);
            }
        }

        return most_common;
    }
}
