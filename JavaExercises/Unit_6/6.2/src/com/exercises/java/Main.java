package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        int result = sumDigits(n);
        System.out.println("Result is: "+result);
    }

    public static int sumDigits(long n){

        int result = 0;

        while(n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
}
