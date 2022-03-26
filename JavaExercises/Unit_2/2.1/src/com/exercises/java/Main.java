package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double km;
        System.out.println("Insert miles to convert");
        Scanner input = new Scanner(System.in);
        double miles = input.nextDouble();
        km = miles * 1.6;
        System.out.println("The result is: "+km+" km");

    }
}
