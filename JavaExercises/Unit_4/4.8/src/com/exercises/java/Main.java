package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        String string = input.nextLine();
        char c = string.charAt(0);
        int ascii = c;
        System.out.println("The ASCII code for character "+c+" is "+ascii);

    }
}
