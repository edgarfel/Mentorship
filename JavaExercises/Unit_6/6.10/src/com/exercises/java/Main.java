package com.exercises.java;

public class Main {

    public static void main(String[] args) {
        int prime = 0;

        for (int i = 1; i < 10000; i++) {
            if (isPrime(i))
                prime++;
        }

        System.out.println("Prime numbers less than 10000: " + prime);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }
}

