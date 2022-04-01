package com.exercises.java;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character");
        String character= input.nextLine().toLowerCase(Locale.ROOT);
        char c = character.charAt(0);
        if (Character.isLetter(c))
        {
            switch(c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': System.out.println(c + " is a vowel"); break;
                default : System.out.println(c + " is a consonant");
            }
        }
        else
            System.out.println(c+ " invalid input");




    }
}
