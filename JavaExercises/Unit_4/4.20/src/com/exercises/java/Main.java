package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        int length = str.length();
        System.out.println("The length of the string is: "+length+" and the last character is: "+str.charAt(str.length()-1));

    }
}
