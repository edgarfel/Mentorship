package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount");
        double amount = input.nextDouble();
        System.out.println("Enter monthly interest rate");
        double interest = input.nextDouble();

        for (int i = 1; i <=30 ; i++) {
             System.out.println(i+"  "+futureInvestmentValue(amount,interest,i));

        }



    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years){
        double value = investmentAmount * Math.pow(1 + monthlyInterestRate / 100 / 12, years * 12);
        return value;

    }
}
