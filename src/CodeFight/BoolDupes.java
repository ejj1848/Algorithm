package CodeFight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class BoolDupes {


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 4, 7, 9, 1};
        Integer[] pretty = IntStream.of(a).boxed().toArray(Integer[]::new);

        System.out.println(containsDupes(pretty, a));
    }

    private static boolean containsDupes(Integer[] pretty, int[] a) {
        HashSet<Integer> mySet = new HashSet<>(Arrays.asList(pretty));
        boolean result;

        result = a.length != mySet.size();

        return result;
    }
}
