package com.exercises.java;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Insert number of minutes");
        Scanner input = new Scanner(System.in);
        long minutes = input.nextLong();
        long days = minutes / 1440;
        long years = days / 365;
        long remainingDays = days%365;
        System.out.println(minutes+" is approximately "+years+" years and "+remainingDays+" days");



    }
}
