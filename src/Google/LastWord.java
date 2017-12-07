package Google;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LastWord {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String starter = scanner.nextLine();
        System.out.println(lastWordNonTernary(starter));

    }

    private static String lastWordNonTernary(String string) {
        List<String> charStrings = Arrays.asList(string.split(""));

        return charStrings.stream().reduce("", (result, compare) -> {
            if (result.equals("")) {
                return compare;
            }
            else if (Character.compare(result.charAt(0), compare.charAt(0)) <= 0)
            {
                return compare + result;
            }

            {
                return result + compare;
            }
        });
    }
}

