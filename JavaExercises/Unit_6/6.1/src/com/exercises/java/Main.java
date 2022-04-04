package com.exercises.java;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
           int pentagonal = getPentagonalNumber(i);
            System.out.println(pentagonal);

        }

    }

    public static int getPentagonalNumber(int n){
        int result= n*((3*n)-1)/2;
        return result;

    }
}
