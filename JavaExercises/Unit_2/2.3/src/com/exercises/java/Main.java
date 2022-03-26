package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insert meters to convert");
        Scanner input = new Scanner(System.in);
        double meters=input.nextDouble();
        double feet = meters*3.2786;
        System.out.println("The result is: "+feet+" feet");

    }
}
