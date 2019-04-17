package com.company;

/**
 * Created by ericjohn1 on 1/25/2017.
 */
public class Fbuzzsum {
    public static void main(String[] args) {
        StringBuilder numberString = new StringBuilder();
        int sumCount= 0;

        for (int i = 1; i <= 100; ++i) {

            if (i % 3 == 0 || i % 5 == 0)

                numberString.append(i);
                numberString.append("+");

                sumCount += i;

            System.out.println(sumCount);
        }
    }

}
