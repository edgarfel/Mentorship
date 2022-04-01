package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert Number 0 for heads, 1 for tails: ");
        int userNum= input.nextInt();
	int number = (int) Math.floor(Math.random()*(1-0+1)+0);
    if(userNum==number){
        System.out.println("You win");

    }
    else{
        System.out.println("You lose");

    }


    }
}
