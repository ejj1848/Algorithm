package CrackingCode;

public class IsUnique {

    final static String input = "abacd";

    public static void main(String[] args) {

        System.out.println(compareIndex(input));
        boolean isUniqueString = true;

        breakLoop:
        for (int i = 0; i <= input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                System.out.println("COMPARING: " + input.charAt(i) + " == " + input.charAt(j));

                if (input.charAt(i) == input.charAt(j)) {
                    isUniqueString = false;
                    break breakLoop;
                }
            }
        }
        System.out.println(isUniqueString);
    }

    //Other Option
    private static boolean compareIndex(String input) {
        boolean result = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.lastIndexOf(input.charAt(i)) != i) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
