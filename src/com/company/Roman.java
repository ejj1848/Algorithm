package com.company;

import java.util.Scanner;

/**
 * Created by ericjohn1 on 9/19/2016.
 */
public class Roman {

    public static void main(String[] args) {

        romanExercise();
    }


        public static void romanExercise() {

            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter an int");

                System.out.println(numToRoman(input.nextInt()));
            }

        }

    public static String numToRoman(int input) {
        String result = "";
        while(input >= 1000) {
            input = input - 1000;
            result += "M";
        }
        if(input >= 900) {
            input = input - 900;
            result += "CM";
        }
        if(input >= 500) {
            input = input - 500;
            result += "D";
        }
        if(input >= 400) {
            input = input - 400;
            result += "CD";
        }
        while(input >= 100) {
            input = input - 100;
            result += "C";
        }
        if(input >= 90) {
            input = input - 90;
            result += "XC";
        }
        if(input >= 50) {
            input = input - 50;
            result += "L";
        }
        if(input >= 40) {
            input = input - 40;
            result += "XL";
        }
        while(input >= 10) {
            input = input - 10;
            result += "X";
        }if(input >= 9) {
            input = input - 9;
            result += "IX";
        }
        if(input >= 5) {
            input = input - 5;
            result += "V";
        }
        if(input >= 4) {
            input = input - 4;
            result += "IV";
        }
        while(input >= 1) {
            input = input - 1;
            result += "I";
        }

        return result;
    }
}