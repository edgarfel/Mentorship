package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(isPalindrome(number)){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Is not palindrome");
        }


    }

    public static int reverse(int number) {
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number = number / 10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
