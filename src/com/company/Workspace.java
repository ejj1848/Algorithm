package com.company;


public class Workspace {


    public static void main(String[] args) {

        Integer num = 100;
        Boolean seesaw = true;

        for (int i = 0; i < (num / 2); ) {
            if (seesaw) {
                System.out.println(i + 1);
                seesaw = false;
            } else {
                System.out.println((num - i));
                seesaw = true;
                i++;
            }
        }
    }

}
