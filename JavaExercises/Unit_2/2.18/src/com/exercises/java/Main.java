package com.exercises.java;

public class Main {

    public static void main(String[] args) {
	    double a[]= {0, 0};
        double b[]= {2,1};
        double middle[]={(a[0]+b[0])/2,(a[1]+b[1])/2};
        System.out.println("a                b              Middle point");
        System.out.println("( "+a[0]+" , "+a[1]+" )  ( "+b[0]+" , "+b[1]+" )   ("+ middle[0]+" , "+middle[1]+" )");
        a[0]=1;
        a[1]=4;
        b[0]=4;
        b[1]=2;
        middle[0]=(a[0]+b[0])/2;
        middle[1]=(a[1]+b[1])/2;
        System.out.println("( "+a[0]+" , "+a[1]+" )  ( "+b[0]+" , "+b[1]+" )   ("+ middle[0]+" , "+middle[1]+" )");
        a[0]=2;
        a[1]=7;
        b[0]=6;
        b[1]=3;
        middle[0]=(a[0]+b[0])/2;
        middle[1]=(a[1]+b[1])/2;
        System.out.println("( "+a[0]+" , "+a[1]+" )  ( "+b[0]+" , "+b[1]+" )   ("+ middle[0]+" , "+middle[1]+" )");
        a[0]=3;
        a[1]=9;
        b[0]=10;
        b[1]=5;
        middle[0]=(a[0]+b[0])/2;
        middle[1]=(a[1]+b[1])/2;
        System.out.println("( "+a[0]+" , "+a[1]+" )  ( "+b[0]+" , "+b[1]+" )   ("+ middle[0]+" , "+middle[1]+" )");
        a[0]=4;
        a[1]=11;
        b[0]=12;
        b[1]=7;
        middle[0]=(a[0]+b[0])/2;
        middle[1]=(a[1]+b[1])/2;
        System.out.println("( "+a[0]+" , "+a[1]+" )  ( "+b[0]+" , "+b[1]+" )   ("+ middle[0]+" , "+middle[1]+" )");

    }
}
