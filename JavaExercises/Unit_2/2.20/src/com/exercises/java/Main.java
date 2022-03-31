package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%)");
        double balance= input.nextDouble();
        double interRate=input.nextDouble();
        double interest = balance*(interRate/1200);
        System.out.println("The interest is: "+interest);



    }
}
