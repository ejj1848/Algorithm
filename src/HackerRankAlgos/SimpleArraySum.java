package HackerRankAlgos;

import java.util.stream.IntStream;

/**
 * Created by ericjohn1 on 11/17/2016.
 */
public class SimpleArraySum {

    public static void main(String[] args) {

        int[] numbersToAdd = {1,2,3,4,10,11};
        int sum = IntStream.of(numbersToAdd).sum();
        System.out.println("The sum is: " + sum);
    }
}
