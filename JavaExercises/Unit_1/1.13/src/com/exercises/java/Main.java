package com.exercises.java;

public class Main {

    public static void main(String[] args) {

        //3.4x + 50.2y = 44.5
        //2.1x + .55y = 5.9
        double x,y;
        double a,b,c,d,e,f;
        a=3.4;
        b=50.2;
        c=2.1;
        d=0.55;
        e=44.5;
        f=5.9;
        x=((e*d)-(b*f))/((a*d)-(b*c));
        y=((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("Equation:");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + .55y = 5.9");
        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is: "+y);




    }
}
