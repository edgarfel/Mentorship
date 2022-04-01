package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert number");
        String number= input.nextLine();
        int[] num = new int[number.length()];
        for (int i = 0; i <number.length() ; i++) {
            num[i]=Character.getNumericValue(number.charAt(i));

        }
        int lastNum=((num[0]*1)+(num[1]*2)+(num[2]*3)+(num[3]*4)+(num[4]*5)+(num[5]*6)+(num[6]*7)+(num[7]*8)+(num[8]*9))%11;
        if(lastNum<9) {
            System.out.println("The ISBN-10 number is: " + number + lastNum);
        }
        else{
            System.out.println("The ISBN-10 number is: " + number +"X");

        }

    }
}
