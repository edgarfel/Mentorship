package com.exercises.java;

public class Main {

    public static void main(String[] args) {

        reverse(3456);

    }
    public static void reverse(int number){
        int reversed =0;
        while(number!=0){
            int lastDigit = number%10;
            reversed= reversed * 10 +lastDigit;
            number = number/10;
        }
        System.out.println("Reversed number is: "+reversed);


    }
}
