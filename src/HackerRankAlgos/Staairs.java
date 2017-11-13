package HackerRankAlgos;

import java.util.*;

public class Staairs {

    public static void main(String[] args) {
        System.out.println("Enter any Number between 1-100: ");
        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (height - i - 2 < j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
