package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Insert a number");
        Scanner input = new Scanner(System.in);
        double squaremeter = input.nextDouble();
        double ping = squaremeter*0.3025;
        System.out.println("the result is: "+ping+" pings");




    }
}
