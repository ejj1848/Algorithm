package CareerCup;

/*  Google
 * Given two strings - S1 and S2.
 * Arrange the characters of S1 in same alphabetical order as the characters of S2.
 * If a character of S1 is not present in S2 - such characters should come at the end of
 * the result string, but make sure to retain the order of such characters
 * Case sensitivity is irrelevant
 * e.g. S1 = Google, S2 = dog;
 * Output = dooggle;
 *
 * e.g. S1 =abcdedadf; S2 =cae;
 * Output = ccaaebdddf;
 *
 */

public class GoogleTechRdOne {

    public static void main(String[] args) {

        String s1 = "abc";
        String a1 = s1.toLowerCase();
        String s2 = "cba";
        String a2 = s2.toLowerCase();

        System.out.println(arrangeChars(a1, a2));
    }

    private static StringBuilder arrangeChars(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        // build first string if chars exist in Both
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s2.charAt(i) == s1.charAt(j)) {
                    sb.append(s1.charAt(j));
                }
            }
        }
        // build temp string if chars exist in S1 not in S2
        for (int i = 0; i < s1.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    flag = true;
                }
            }
            if (!flag) {
                temp.append(s1.charAt(i));
            }
        }
        return sb.append(temp);
    }
}
