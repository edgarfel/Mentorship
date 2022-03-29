package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int result=0;
        System.out.println("Insert a number between 0 and 999");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int first = number%10;
        int remaining = number/10;
        int second = remaining%10;
        remaining=remaining/10;
        int third = remaining%10;
        remaining=remaining/10;
        int fourth = remaining%10;
        if(fourth<0){
            result = first * second * third * fourth;

        }
        if(fourth==0) {
            result = first * second * third ;
        }
        if(third==0){
            result = first * second ;
        }
        if(second==0){
            result = first;
        }
        System.out.println("The result is: "+result);


    }
}
