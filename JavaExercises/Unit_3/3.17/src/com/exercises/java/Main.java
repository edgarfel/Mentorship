package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] selection = {"Scissor","Rock","Paper"};
        Scanner input = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2) ");
        int userSel= input.nextInt();
        int number = (int) Math.floor(Math.random()*(2-0+2)+0);
        if(number>=3){
            number=number-1;
        }
        System.out.println("You have selected "+selection[userSel]);
        System.out.println("Machine has selected "+selection[number]);
        if((userSel==0&&number==2)||(userSel==1&&number==0)||(userSel==2&&number==1)){
            System.out.println("You win");
        }
       else if(userSel==number){
            System.out.println("Draft");

        }
       else{
            System.out.println("You Lose");
        }



    }
}
