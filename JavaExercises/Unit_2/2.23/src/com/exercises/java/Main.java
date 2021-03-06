package com.exercises.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.00");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles = scanner.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = scanner.nextDouble();
        double cost = (distance / miles) * price;
        System.out.println("The cost of driving is $" + df.format(cost));

    }
}
