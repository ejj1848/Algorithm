package Google;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Neighhbors {

    public static void main(String[] args) {


        Scanner scanny = new Scanner(System.in);
        int n = scanny.nextInt();

        int r = scanny.nextInt();

        int o = scanny.nextInt();

        int y = scanny.nextInt();

        int g = scanny.nextInt();

        int b = scanny.nextInt();

        int v = scanny.nextInt();


        Color[] colors = new Color[6];
        colors[0] = new Color(r, 'R');
        colors[1] = new Color(o, 'O');
        colors[2] = new Color(y, 'Y');
        colors[3] = new Color(g, 'G');
        colors[4] = new Color(b, 'B');
        colors[5] = new Color(v, 'V');
        Arrays.sort(colors, (a, b1) -> b1.count - a.count);

    }

    static class Color {

        int count;
        char c;

        public Color(int count, char c) {
            this.count = count;
            this.c = c;
        }
    }
}
