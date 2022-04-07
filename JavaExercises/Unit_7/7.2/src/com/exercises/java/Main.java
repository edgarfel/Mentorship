package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 11 integers");
        int[] integers = new int[11];
        for (int i = 0; i <=10; i++) {
            integers[i]=input.nextInt();


        }
        for (int i = 0; i <10; i++) {
            if(integers[i]==integers[10])
                System.out.println(integers[i]+" is equal to "+integers[10]);
            if(integers[i]>integers[10])
                System.out.println(integers[i]+" is greater than "+integers[10]);
            if(integers[i]<integers[10])
                System.out.println(integers[i]+" is smaller than "+integers[10]);



        }

    }
}
