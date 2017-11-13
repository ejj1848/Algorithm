package HackerRankAlgos;

/**
 * Created by ericjohn1 on 11/17/2016.
 */
public class CompareTriplets {
    public static void main(String[] args) {


        int a0 = 5;
        int a1 = 6;
        int a2 = 7;

        int b0 = 3;
        int b1 = 6;
        int b2 = 10;

        int pointsAlice = ((a0 > b0) ? 1 : 0) + ((a1 > b1) ? 1 : 0) + ((a2 > b2) ? 1 : 0);
        int pointsBob = ((a0 < b0) ? 1 : 0) + ((a1 < b1) ? 1 : 0) + ((a2 < b2) ? 1 : 0);

        System.out.println(pointsAlice + " " + pointsBob);
    }
}
