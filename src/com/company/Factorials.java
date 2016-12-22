package com.company;


import java.util.Scanner;

/**
 * Created by ericjohn1 on 10/11/2016.
 */
public class Factorials {

    public static void main(String[] args) {

        int total = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");

        int number = scan.nextInt();
        for(int i= 1; i<number; ++ i){

            total = total*i;
            if(total == number){
                System.out.println("Factorial is: " + i + "!");
                break;
            }
            if(total > number){
                System.out.println("Before you criticize someone, you should walk a mile in their shoes. That way when you criticize them, you are a mile away from them and you have their shoes");
                break;
            }
        }

    }
}
