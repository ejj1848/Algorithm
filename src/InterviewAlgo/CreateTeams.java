package InterviewAlgo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CreateTeams {

    public static void main(String[] args) {
        createTeams("cpbmz", "cpbz");

    }

    private static void createTeams(String studies, String s) {

        Map<Character, Integer> letterCount = new HashMap<>();

        for (char c : studies.toCharArray()) {
            letterCount.put(c, 0);
        }
        for (char a : s.toCharArray()) {
            letterCount.replace(a, letterCount.get(a) + 1);
        }

        System.out.println("Number of Teams: " + Collections.min(letterCount.values()));

    }
}
