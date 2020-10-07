package btu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ClassB {
    int a, b, c;

    public void Method1(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nInput numbers:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }

    public void Method2(){
        int[] nums = new int[]{a, b ,c};
        int max = nums[0];

        for(int i = 1; i < nums.length; i++)
            if(nums[i] > max)
                max = nums[i];

        System.out.println("\nMax: " + max);
    }

    public int Method3(){
        int[] nums = new int[]{a, b ,c};
        int min = nums[0];

        for(int i = 1; i < nums.length; i++)
            if(nums[i] < min)
                min = nums[i];

        return min;
    }
}
