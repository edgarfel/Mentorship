package com.exercises.java;

public class Main {

    public static void main(String[] args) {

        double miles = 24;
        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double distance = 24*1.6;
        double totalTime = hours + (minutes/60) + (35/3600);
        float speed = (float) (distance/totalTime);
        System.out.println("The speed is: "+speed+" Kilometers per hour");

    }
}
