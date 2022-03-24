package com.exercises.java;

public class Main {

    public static void main(String[] args) {

        double kilometers = 15;
        double minutes = 50;
        double seconds = 30;
        double distance = kilometers/1.6;
        double hours = (minutes/60)+(seconds/3600);
        double speed = distance/hours;
        System.out.println("The speed is: "+speed+" Miles per hour");

    }
}
