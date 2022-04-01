package com.exercises.java;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character");
        String letter=input.nextLine();
        letter=letter.toLowerCase(Locale.ROOT);
        char c= letter.charAt(0);
        int number=0;
        if(Character.isLetter(c)){
            if(c=='a'||c=='b'||c=='c'){
                number=2;

            }
            if(c=='d'||c=='e'||c=='f'){
                number=3;

            }
            if(c=='g'||c=='h'||c=='i'){
                number=4;

            }
            if(c=='j'||c=='k'||c=='l'){
                number=5;

            }
            if(c=='m'||c=='n'||c=='o'){
                number=6;

            }
            if(c=='p'||c=='q'||c=='r'||c=='s'){
                number=7;

            }
            if(c=='t'||c=='u'||c=='v'){
                number=8;

            }
            if(c=='w'||c=='x'||c=='y'||c=='z'){
                number=9;

            }
            System.out.println("The corresponding number is: "+number);
        }
        else{
            System.out.println("Invalid character");
        }

    }
}
