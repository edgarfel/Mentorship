package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today’s day ");
        int today= input.nextInt();
        System.out.println("Enter the number of days elapsed since today ");
        int elapsed=input.nextInt();
        int futureDay = today;
        for (int i = 0; i <elapsed ; i++) {
            System.out.println(futureDay);
            if(futureDay==6){
                futureDay=-1;
            }
            futureDay++;



        }
        System.out.println("Today is "+days[today]+" and the future day is "+days[futureDay]);

    }
}
