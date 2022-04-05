package com.exercises.java;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Miles       Kilometers      |     Kilometers      Miles");
        System.out.println("________________________________________________________");
        int kil=20;

        for (int i = 1; i <=10 ; i++) {

            System.out.println(i+"              "+df.format(mileToKilometer(i))+"        |       "+kil+"           "+kilometerToMile(kil));
            kil=kil+5;
            
        }

    }

    public static double mileToKilometer(double mile){
        double kilometer = mile*1.6;
        return kilometer;
    }
    public static double kilometerToMile(double kilometer){
        double mile = kilometer/1.6;
        return kilometer;
    }
}
