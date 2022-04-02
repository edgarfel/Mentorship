package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int number = input.nextInt();
        String[] students=new String[number];
        float[] score=new float[number];
        int locator=0;

        float highest=0;
        for (int i = 0; i < number; i++) {
            System.out.println("Enter student name: ");
            students[i]= input.next();
            System.out.println("Enter score of student");
            score[i]=input.nextFloat();

        }
        for (int i = 0; i <number ; i++) {
            if(score[i]>highest){
                highest=score[i];
                locator = i;

            }


        }
        System.out.println("The student with highest score is: "+students[locator]+" with score of: "+highest);


    }
}
