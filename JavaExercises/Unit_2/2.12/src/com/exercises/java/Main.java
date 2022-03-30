package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter speed and acceleration ");
        Scanner input = new Scanner(System.in);
        double speed = input.nextDouble();
        double acceleration= input.nextDouble();
        double length=(speed*speed)/(2*acceleration);
        System.out.println("The length is: "+length);

    }
}
