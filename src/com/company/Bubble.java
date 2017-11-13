package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by eric.johnson on 5/18/2017.
 */
public class Bubble {

    public static void main(String[] args) {
        int b[] = {1, 23, 4, 67, 8};
        bubbleSort(b);
    }

    public static void bubbleSort(int ar[]) {
        for (int i = (ar.length - 1); i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (ar[j - 1] > ar[j]) {
                    int holder = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = holder;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}

