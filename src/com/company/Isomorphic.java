package com.company;

import java.util.HashMap;

/**
 * Created by Eric.Johnson on 5/30/2017.
 */
public class Isomorphic {

    public static void main(String[] args) {

        isIsomorphic("egg", "add");

    }

    public static void  isIsomorphic(String s, String t) {
        boolean answer = false;

        if (s == null || t == null)
            answer= false;


        if (s.length() != t.length())
            answer= false;

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);


            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    answer = false;
                }
            } else {
                if (map.containsValue(c2)) {
                    answer = false;
                    map.put(c1,c2);

                }

            }
        }
        System.out.println(answer);
    }



}

