package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month");
        int month = input.nextInt();
        System.out.println("Enter year");
        int year = input.nextInt();
        String[] monthNames= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            monthDays[1]=29;
        }
        System.out.println("The month "+monthNames[month-1]+" Has "+monthDays[month-1]+" days");


    }
}
