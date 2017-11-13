package com.company;

import java.util.HashMap;
import java.util.Map;

public class Scrambler {

    static String originalWord = "soos";
    static String maybeScrambled = "ooss";

    public static void main(String[] args) {

        if(countLetters(originalWord).equals(countLetters(maybeScrambled)))
            System.out.println("True");
        else
            System.out.println("False");
    }

    private static Map<Character, Integer> countLetters(String word) {
        Map<Character, Integer> letterCount = new HashMap<>();

        for (Character c : word.toCharArray()) {
            if (!letterCount.containsKey(c))
                letterCount.put(c, 1);

            else
                letterCount.replace(c, letterCount.get(c) + 1);
        }
        return letterCount;
    }
}
