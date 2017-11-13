package com.company;

import java.util.Scanner;

/**
 * Created by ericjohn1 on 12/8/2016.
 */
public class Caeser {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String uns = scan.next();
        int k = scan.nextInt();

        String newString = "";

        for(int i = 0; i<uns.length(); ++i){

            int value = uns.charAt(i);
            if(value >= 97 && value<= 122){
                value = (((value-97)+k) % 26) + 97;
            }
            else if (value >= 65 && value <=90){
                value =  (((value-65)+k) % 26) + 65;
            }

            newString = newString + (char)value;

        }
        System.out.println(newString);
    }
}
