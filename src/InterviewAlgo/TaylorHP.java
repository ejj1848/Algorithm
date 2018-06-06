package InterviewAlgo;

import java.util.HashSet;
import java.util.Set;

public class TaylorHP {

    static String S = "John Doe, Peter Benjamin Parker, Mary Jane Watson-Parker, John Elvis Doe, John Evan Doe, Jane Doe, Peter Brian Parker, Peter Parker";
    static String C = "Example";

    public static void main(String[] args) {
        TaylorHP m = new TaylorHP();
        System.out.println(m.solution(S, C));
    }

    public String solution(String S, String C) {
        // write your code in Java SE 8
        Set<String> emailSet = new HashSet<String>();
        StringBuilder finalString = new StringBuilder();

        String names[] =  S.split(",");
        for(String name : names) {

            String email = makeEmail(name, C).toLowerCase();
            int counter = 2;
            while(emailSet.contains(email)) {
                email = incrementEmail(name, C, counter).toLowerCase();
                counter++;
            }
            email = email.replace("-","");
            emailSet.add(email.toLowerCase());
            finalString.append(name.trim())
                    .append(" <")
                    .append(email)
                    .append(">, ");

        }


        return trimEnd(finalString.toString());
    }

    public String extractFirstName(String name) {
        name = name.trim();
        String words[] = name.split(" ");
        return words[0];
    }

    public String extractLastName(String name) {
        name = name.trim();
        String words[] = name.split(" ");
        return words[words.length-1];
    }

    public String makeEmail(String name, String company) {
        return extractFirstName(name) + "_" + extractLastName(name) + "@" + company + ".com";
    }

    public String incrementEmail(String name, String company, int incr) {
        return extractFirstName(name) + "_" + extractLastName(name) + incr + "@" + company + ".com";
    }

    public String trimEnd(String s) {
        return s.substring(0, s.length()-2);
    }

}
