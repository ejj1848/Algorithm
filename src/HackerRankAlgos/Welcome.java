package HackerRankAlgos;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by ericjohn1 on 12/20/2016.
 */
public class Welcome {

//    static float horsesOnPath = 1;
//    static float totalDistance = 2525;
//    static float pathPosition = 2400;
//    static float maxSpeedOfHorse = 5;

    static float horsesOnPath = 2;
    static float totalDistance = 100;
    static float pathPosition = 80;
    static float maxSpeedOfHorse = 100;
    static float pathPosition2 = 70;
    static float maxSpeedOfHorse2 = 10;

    public static void main(String[] args) {

        if(horsesOnPath ==1) {
            System.out.println(calculateTopSpeedOneHorse(totalDistance, pathPosition, maxSpeedOfHorse));
        }
        else {
            System.out.println(calculateTopSpeedTwoHorse(totalDistance,pathPosition,maxSpeedOfHorse, pathPosition2, maxSpeedOfHorse2));
        }
    }

    private static float calculateTopSpeedTwoHorse(float totalDistance, float pathPosition, float maxSpeedOfHorse, float pathPosition2 , float maxSpeedOfHorse2) {

        return  totalDistance/(Math.max(getHoursLeft(totalDistance, pathPosition, maxSpeedOfHorse), getHoursLeft(totalDistance, pathPosition2, maxSpeedOfHorse2)));

    }

    private static float calculateTopSpeedOneHorse(float totalDistance, float pathPosition, float maxSpeedOfHorse) {

        return totalDistance/getHoursLeft(totalDistance, pathPosition, maxSpeedOfHorse);


    }

    private static float getHoursLeft(float totalDistance, float pathPosition, float maxSpeedOfHorse) {
        float horseRemainder = totalDistance - pathPosition;
        return  horseRemainder/maxSpeedOfHorse;
    }

}


