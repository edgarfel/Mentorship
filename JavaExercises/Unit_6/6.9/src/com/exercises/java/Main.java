package com.exercises.java;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Kilogram       Pounds      |     Pounds      Kilograms");
        System.out.println("________________________________________________________");
        int pnd=20;

        for (int i = 1; i <=10 ; i++) {

            System.out.println(i+"              "+df.format(kilogramToPound(i))+"        |       "+pnd+"           "+df.format(poundToKilogram(pnd)));
            pnd=pnd+5;

        }

    }
    public static double poundToKilogram(double pound){
        double kilogram= pound*0.453;
        return kilogram;
    }
    public static double kilogramToPound(double kilogram){
        double pound = kilogram*2.204;
        return pound;
    }
}
