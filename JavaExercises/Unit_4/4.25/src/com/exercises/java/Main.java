package com.exercises.java;

public class Main {

    public static void main(String[] args) {
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',};
        System.out.println("The plate number is: ");
        int letter1= (int) Math.floor(Math.random()*(25-0+1)+0);
        System.out.print(letters[letter1]);
        int letter2= (int) Math.floor(Math.random()*(25-0+1)+0);
        System.out.print(letters[letter2]);
        int letter3= (int) Math.floor(Math.random()*(25-0+1)+0);
        System.out.print(letters[letter3]);
        int number1= (int) Math.floor(Math.random()*(9-0+1)+0);
        System.out.print(number1);
        int number2= (int) Math.floor(Math.random()*(9-0+1)+0);
        System.out.print(number2);
        int number3= (int) Math.floor(Math.random()*(9-0+1)+0);
        System.out.print(number3);
        int number4= (int) Math.floor(Math.random()*(9-0+1)+0);
        System.out.print(number4);

        //char[] plate ={letters[letter1],letters[letter2],letters[letter3], (char) number1, (char) number2, (char) number3, (char) number4};



    }
}
