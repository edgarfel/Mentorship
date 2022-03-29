package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");

        int offset = input.nextInt();
        long millis = System.currentTimeMillis();
        long seconds = millis / 1000;
        long currentSec = seconds % 60;
        long minutes = seconds / 60;
        long currentMin = minutes % 60;
        long hours = minutes / 60;
        long currentHour = hours % 24;
        currentHour = currentHour + offset;
        System.out.println("The current time is: " + currentHour + ":" + currentMin + ":" + currentSec);
    }

}

