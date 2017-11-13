package Prep.Poly.Rando;

import java.util.Scanner;

/**
 * Created by Eric.Johnson on 6/21/2017.
 */
public class Clock {

    public static void main(String[] args) {
        calculations();
    }

    public static void calculations(){



        System.out.println("Please enter any amount of seconds");
        Scanner scanner = new Scanner(System.in);
        double seconds = Integer.parseInt(String.valueOf(scanner.next()));

        double minutes = seconds/60;
        double hours = minutes/60;
        double days = hours/24;


        System.out.println("Minutes " + minutes);
        System.out.println("Hours " + hours);
        System.out.println("Days "+ days);
    }
}
