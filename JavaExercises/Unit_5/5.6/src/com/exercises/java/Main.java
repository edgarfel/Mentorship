package com.exercises.java;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        final DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Ping    Square meter   |   Square meter    Ping");

        double ping=10;
        double squareMeter=0;
        double png=20;
        double sqm=30;



        for (int i = 0; i <50 ; i++){
            squareMeter=ping*3.305;
            png = sqm/3.305;
            System.out.println(ping+"     "+df.format(squareMeter)+"         |          "+sqm+"    "+df.format(png));
            ping=ping+5;
            sqm=sqm+5;

        }
    }
}
