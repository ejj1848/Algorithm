package InterviewAlgo;

import java.util.HashMap;
import java.util.Map;

public class Dupenums {

    final private static String numInput = "12222;1,2,3,4,5,6,7,8,9,1";


    public static void main(String[] args) {
        String s = numInput.substring(numInput.lastIndexOf(';') + 1);
        String pretty = s.replaceAll(",", "");

        System.out.println(findDupey(countLetters(pretty)));
    }

    private static Character findDupey(Map<Character, Integer> myMap) {

        for (Object o : myMap.keySet()) {
            if (myMap.get(o).equals(2)) {
                return (Character) o;
            }
        }
        return 'n';
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
