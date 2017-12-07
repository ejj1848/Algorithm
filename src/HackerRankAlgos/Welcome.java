package HackerRankAlgos;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by ericjohn1 on 12/20/2016.
 */
public class Welcome {


    // create a function
    // allow function to eval 2 strings
    // check sr1 against s2  length wise
    // Checl charactes
    // Check count
    //return boolean

    static String string1 = "beer";
    static String string2 = "bear";

    public static void main(String[] args) {

        System.out.println(checker(string1, string2));

    }

    private static Boolean checker(String string1, String string2) {
        boolean checkeValue = true;
        if (checkStringLength(string1, string2)) {
            checkeValue = letterCount(string1).equals(letterCount(string2));
        } else {
            checkeValue = false;

        }

        return checkeValue;
    }

    private static Boolean checkStringLength(String string1, String string2) {
        return (string1.length() == string2.length());

    }

    private static Map<Character, Integer> letterCount(String word) {
        Map<Character, Integer> letterCount = new HashMap<>();

        for (Character c : word.toCharArray()) {
            if (!letterCount.containsKey(c))
                letterCount.put(c, 1);
            else {
                letterCount.replace(c, letterCount.get(c) + 1);
            }
        }
        return letterCount;
    }
}


