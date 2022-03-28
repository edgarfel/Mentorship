package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insert subtotal");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        System.out.println("Insert gratuity rate");
        Scanner input2 = new Scanner(System.in);
        double gratRate = input.nextDouble();
        double gratuity=(gratRate*subtotal)/100;
        double total=gratuity+subtotal;
        System.out.println("The gratuity is: "+gratuity);
        System.out.println("The total is: "+total);




    }
}
