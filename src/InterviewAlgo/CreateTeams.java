package InterviewAlgo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CreateTeams {

    /* Given a string of letters , each letter being a certain specialty, how many teams can you create, each team has to have exactly 1 of each Specialtyy
    specialties = c, p, b, m, z,
    note: the string will only contain specialties
    */
    public static void main(String[] args) {
        createTeams("cpbmz", "cpbmzzzzz");

    }

    private static void createTeams(String studies, String input) {

        Map<Character, Integer> letterCount = new HashMap<>();

        for (char c : studies.toCharArray()) {
            letterCount.put(c, 0);
        }
        for (char a : input.toCharArray()) {
            letterCount.replace(a, letterCount.get(a) + 1);
        }

        System.out.println("Number of Teams: " + Collections.min(letterCount.values()));

    }
}
