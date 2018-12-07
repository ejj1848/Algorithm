package Google;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// 2016 1B Code Jams
public class CallMe {

    private static String testCase = "OZONETOWER";
    private static List<String> dictionary = Arrays.asList(
            "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"
    );

    public static void main(String[] args) {

        System.out.println(findThePhoneNumber(testCase));
        System.out.println(dictionary);

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

