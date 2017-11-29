package HackerRankAlgos;

import java.util.Arrays;


/**
 * Created by ericjohn1 on 12/20/2016.
 */
public class Welcome {

    public static void main(String[] args) {

        System.out.println(findNumOccur("To be or not to be, that is the question", "be"));


    }
    private static Integer findNumOccur(String aLine, String wordToMatch) {
        String niceString = aLine.replaceAll("[^A-Za-z0-9 ]", " ");
        System.out.println(niceString);
        return Arrays.stream(niceString.split(" "))
                .filter(word -> word.equals(wordToMatch))
                .toArray().length;
    }
}


