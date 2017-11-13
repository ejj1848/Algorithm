package InterviewAlgo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eric.Johnson on 6/19/2017.
 */
public class Words {


//    *  This algorithm will compare 2 strings and determine if the number of instances
//    *      of each character match.
//            *
//            *  For example:
//            *      "ant" & "tan" would be TRUE
//    *      "bear" & "beer" would be FALSE
//    *      "deer" & "reed" would be TRUE *
//            *
//            */


        static String word1 = "ant";
        static String word2 = "tna";

        public static void main(String[] args) {

            if(countLetters(word1).equals(countLetters(word2)))
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

