package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insert v0, v1, and t");
        Scanner input = new Scanner(System.in);
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double time = input.nextDouble();
        double acceleration=(v1-v0)/time;
        System.out.println("The average acceleration is: "+acceleration);





    }
}
