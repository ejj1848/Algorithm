package HackerRankAlgos;

import java.util.*;

public class Staairs {

    public static void main(String[] args) {
        System.out.println("Enter any Number between 1-100: ");
        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();
        createStairs(height);
    }

    private static void createStairs(int height) {

        StringBuilder sb =new StringBuilder();

        for (int i = 0; i < height; i++) {
            System.out.println(sb.append("#"));
        }
    }
}
