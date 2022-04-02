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

        float lowest=100;
        for (int i = 0; i < number; i++) {
            System.out.println("Enter student name: ");
            students[i]= input.nextLine();
            System.out.println("Enter score of student");
            score[i]=input.nextFloat();

        }
        for (int i = 0; i <number ; i++) {
            if(score[i]<lowest){
                lowest=score[i];
                locator = i;

            }


        }
        System.out.println("The student with lowest score is: "+students[locator]+" with score of: "+lowest);
    }
}
