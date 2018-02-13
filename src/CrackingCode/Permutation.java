package CrackingCode;

import java.util.HashMap;
import java.util.Map;

// Is isPerm a permutation of original string

public class Permutation {

    final static String orig = "bat";
    final static String isPerm = "tba";

    public static void main(String[] args) {

        if (countLetters(orig).equals(countLetters(isPerm)))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

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
