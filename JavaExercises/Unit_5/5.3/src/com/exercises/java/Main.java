package com.exercises.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Celsius    Fahrenheit");
        //double celsius;
        double farenheit=0;
        double celsius=0;



        for (int i = 0; i <50 ; i++){
            farenheit=celsius*(9.0/5.0)+32;
            System.out.println(celsius+"     "+farenheit);
            celsius=celsius+2;

        }

    }
}
