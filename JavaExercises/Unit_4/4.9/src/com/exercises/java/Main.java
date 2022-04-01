package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character");
        String character=input.nextLine();
        char c = character.charAt(0);
        System.out.println("The unicode of "+c+" is "+(int) c);

    }
}
