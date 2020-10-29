package btu;

import Task1.*;
import Task2.*;
import Task3.*;
import Task4.*;
import Task5.*;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input_int = new Scanner(System.in);
        Scanner input_str = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\nEnter number to check for palindrome:");
        int my_palindrome = input_int.nextInt();
        Palindrome object_task1 = new Palindrome();
        System.out.println(object_task1.IsPalindrome(my_palindrome));

        System.out.println("\nEnter five numbers separated by space, e.g - '142 332 21 5 13' :");
        String[] five_numbers = input_str.nextLine().split(" ");
        NumberIndex object_task2 = new NumberIndex(five_numbers);
        System.out.println(object_task2.ThreeEquals());

        System.out.println("\nEnter number to invert and double:");
        int my_inverted = input_int.nextInt();
        InvertThenDouble object_task3 = new InvertThenDouble();
        System.out.format("Inverted and each digit doubled: %d", object_task3.InvertDigits(my_inverted));

        MatrixRearrange object_task4 = new MatrixRearrange();
        object_task4.RearrangeArrays();
        object_task4.PrintArrays();

        ElementIndex object_task5 = new ElementIndex();
        object_task5.RandomArray();
        object_task5.CompareElements();
    }
}
