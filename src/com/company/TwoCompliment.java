package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

/**
 * Created by on 9/21/2016.
 */
public  class TwoCompliment {



    public static void main(String[] args) {

        getBinaryArray();
    }

    public static void getBinaryArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero de idiota");
        Integer input = scanner.nextInt();

        String binaryString = Integer.toBinaryString(input);

        int[] binaryArray = new int[binaryString.length()];

        for (int i = 0; i < binaryString.length(); ++i) {
            // newGuess[i] = temp.charAt(i) - '0';
            if (binaryString.charAt(i) == '1')
                binaryArray[i] = 1;
            else
                binaryArray[i] = 0;

        }

        System.out.println(Arrays.toString(binaryArray));

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Entre otro numero de idiota");
        Integer input2 = scanner2.nextInt();

        String binaryString2 = Integer.toBinaryString(input2);
        int[] binaryArray2 = new int[binaryString2.length()];

        for (int e = 0; e < binaryString2.length(); ++e) {

            if (binaryString2.charAt(e) == '1')
                binaryArray2[e] = 1;
            else
                binaryArray2[e] = 0;
        }

        System.out.println(Arrays.toString(binaryArray2));


        if (binaryString == null || binaryString2 == null)
            return;
        int first = binaryString.length() - 1;
        int second = binaryString2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += binaryString2.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += binaryString2.charAt(second) - '0';
                second--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }
        if (carry > 0)
            sb.append('1');

        sb.reverse();
        System.out.println("This is the binary: " + sb);
        System.out.println("This is the integer sum: " + (input + input2));

    }
}


