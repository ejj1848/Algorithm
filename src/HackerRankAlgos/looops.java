package HackerRankAlgos;

import java.util.Scanner;

/**
 * Created by ericjohn1 on 12/22/2016.
 */
public class looops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;

            System.out.println(n + "X" + i + "=" + result);
        }
    }
}
