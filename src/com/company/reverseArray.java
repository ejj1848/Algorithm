package com.company;

public class reverseArray {

    public static void main(String[] args) {

        String[] a = {"Eric", "dsfsd", "sdsfsdf"};
        String[] b = new String[a.length];

        int counter = 0;
        for (int i = a.length - 1; i >= 0; i--) {

            b[counter] = a[i];

            counter++;

        }

        for (String s : b) {
            System.out.println(s);
        }
    }

}
