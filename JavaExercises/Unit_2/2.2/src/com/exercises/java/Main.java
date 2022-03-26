package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double area, volume;
        System.out.println("Insert length of sides");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        area = ((Math.sqrt(3))/4)*(length*length);
        volume = area * length;
        System.out.println("The area of the triangle is: "+area);
        System.out.println("The volume of the triangular prism is: "+volume);



    }
}
