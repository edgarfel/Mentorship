package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double amount = input.nextDouble();
        double interest= (3.75/amount)/12;
        double totalinterest=1+interest;
        double firstMonth=amount*(totalinterest);
        double totalAmount=firstMonth;
        for (int i = 1; i < 7; i++) {
            System.out.println("After the "+i+" month, the account value is: "+ totalAmount);
            totalAmount=(amount+totalAmount)*totalinterest;

        }


    }
}
