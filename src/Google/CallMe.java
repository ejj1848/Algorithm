package Google;


import java.util.HashMap;
import java.util.Map;

public class CallMe {

    private static String testCase = "OZONETOWER";

    public static void main(String[] args) {

        System.out.println(findThePhoneNumber(testCase));

    }

    private static String findThePhoneNumber(String testCase) {

        System.out.println(countLetters(testCase));

        return "";
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

