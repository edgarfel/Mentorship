package com.exercises.java;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        final DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Celsius    Fahrenheit   |   Fahrenheit    Celsius");

        double farenheit=0;
        double celsius=0;
        double far=20;
        double cel=0;



        for (int i = 0; i <50 ; i++){
            farenheit=celsius*(9.0/5.0)+32;
            cel = (far-32.0)/1.8;
            System.out.println(celsius+"     "+df.format(farenheit)+"         |          "+far+"    "+df.format(cel));
            celsius=celsius+2;
            far=far+5;

        }


    }
}
