package com.exercises.java;

public class Main {

    public static void main(String[] args) {
        int counter =0;
        for (int i = 100; i <1000; i++) {
            if(i%3==0&&i%4==0){
                System.out.print(i+" ");
                counter++;
            }
            if(counter==10){
                System.out.println();
                counter=0;
            }
            
        }
    }
}
