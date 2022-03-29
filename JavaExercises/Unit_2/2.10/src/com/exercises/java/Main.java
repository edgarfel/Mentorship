package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms");
        double water=input.nextDouble();
        System.out.println("Enter the initial temperature");
        double initialT= input.nextDouble();
        System.out.println("Enter the final temperature");
        double finalT = input.nextDouble();
        double energy = water*(finalT-initialT)*4184;

        System.out.println("The energy needed is: "+energy+" joules");

    }
}
