package Rando;

import java.util.Arrays;

public class Piggy {

    final static String message = "what time is the algorithm today?";

    public static void main(String[] args) {
        String[] words = message.split(" ");
//        Arrays.stream(words).forEach(System.out::println);
        Arrays.stream(words).forEach(w -> {
            System.out.print(w.charAt(0) + " - ");
//            System.out.print(isVowel(w.charAt(0)));
            System.out.println(firstInstanceOfVowel(w));
            if (isVowel(w.charAt(0))) {
                // MOVE FIRST CHAR TO END

                // ADD "AY" AT END

            } else {
                // FIRST INSTANCE OF VOWEL

                // MOVE ALL CHAR BEFORE FIRST VOWEL TO END

                // ADD "AY" AT END

            }
        });

    }


    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }


    public static int firstInstanceOfVowel(String w) {
        int index;
        w.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> {


                });
        return "aeiou".indexOf(w);
    }
}
