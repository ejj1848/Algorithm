package com.company.HackerRankAlgos;

import java.util.Scanner;

/**
 * Created by ericjohn1 on 11/17/2016.
 */
public class CamelCaseCount {
    public static void main(String[] args) {
        System.out.println("Enter a camel case sentence without spaces: ");
        Scanner scn = new Scanner(System.in);
        String camel = scn.next();

        String[] seperated = camel.split("(?=[A-Z])");
        System.out.println(seperated.length);
    }
}
