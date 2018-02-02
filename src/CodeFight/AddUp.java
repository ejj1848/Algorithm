package CodeFight;

import java.util.Collections;
import java.util.HashSet;
import java.util.stream.IntStream;

public class AddUp {


    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {10, 20, 30, 40};
        int v = 42;
        System.out.println(sumOfTwo(a, b, v));

    }

    private static boolean sumOfTwo(int[] a, int[] b, int v) {

        Integer[] pretty = IntStream.of(b).boxed().toArray(Integer[]::new);
        HashSet<Integer> set = new HashSet<>();
        Collections.addAll(set, pretty);

        for (int i = 0; i < a.length; i++) {
            int remainder = (v - a[i]);
            if (set.contains(remainder)) {
                return true;
            }

        }
        return false;

    }
}
