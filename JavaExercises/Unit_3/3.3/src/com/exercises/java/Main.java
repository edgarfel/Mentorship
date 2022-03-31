package com.exercises.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x,y;
        System.out.println("Enter a, b, c, d, e, f ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();
        double e=input.nextDouble();
        double f=input.nextDouble();
        if (((a*d)-(b*c))==0){
            System.out.println("The equation has no solution.");
        }
        else{
            x=((e*d)-(b*f))/((a*d)-(b*c));
            y=((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("The value of x is: "+x);
            System.out.println("The value of y is: "+y);

        }


    }
}
