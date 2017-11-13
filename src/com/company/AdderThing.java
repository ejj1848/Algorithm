package com.company;

import java.util.Scanner;

/**
 * Created by ericjohn1 on 2/14/2017.
 */
public class AdderThing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first Number");
        int first = s.nextInt();
        System.out.println("Enter 2nd number");
        int second = s.nextInt();

        int total = 0;
        for(int i =0; i<first; i++){
           total += second;}

            System.out.println(total);
        }
    }

