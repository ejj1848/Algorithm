package com.company;

import java.lang.reflect.Array;

/**
 * Created by ericjohn1 on 10/13/2016.
 */
public class CowBell {


    public static void main(String[] args) {

        giveHint("12345" , "12345");

    }

    public static String giveHint (String answer, String guess){
        int bull = 0;
        int cow = 0;
        int[] ar1 = new int[10];
        int[] ar2 = new int[10];


        for(int i=0 ; i<answer.length(); ++i){

            char c1 = answer.charAt(i);
            char c2 = guess.charAt(i);

            if(c1==c2)
                bull++;
            else{
                ar1[c1-'0']++;
                ar2[c2- '0']++;
            }
        }
        for (int i=0; i<10; ++i){
            cow += Math.min(ar1[i], ar2[2]);
        }
        System.out.println(bull+"B"+cow+"C");
        return bull+"B"+ cow+"C";


    }


}
