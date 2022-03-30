package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches");
        double height = input.nextDouble();
        double kilos = weight *0.45359237;
        double meters = height*0.0254;
        double bmi= kilos/(meters*meters);
        System.out.println("BMI is: "+bmi);

    }
}
