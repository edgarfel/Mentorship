package com.exercises.java;

public class Main {

    public static void main(String[] args) {
        int randomint=(int)Math.floor(Math.random()*(12-1+1)+1);
        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("The random month is: "+month[randomint-1]);

    }
}
