package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score =0;

        do{
            System.out.println("Enter your score");
            score = input.nextInt();
            if(score>=60){
                System.out.println("You pass the exam");
            }
            if(score<60&&score!=-1){
                System.out.println("You don't pass the exam");
            }

        }while (score != -1);


    }
}
