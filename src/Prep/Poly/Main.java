package Prep.Poly;

import java.util.Scanner;

/**
 * Created by Eric.Johnson on 6/20/2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        double input1 = scan.nextDouble();
        System.out.println("Enter any number: ");
        double input2 = scan.nextDouble();

        Addition add = new Addition();
        System.out.println(add.operation(input1, input2));

        Subtraction subtraction = new Subtraction();
        System.out.println(subtraction.operation(input1,input2));

        Division division = new Division();
        System.out.println(division.operation(input1,input2));

        Multiplication multiplication = new Multiplication();
        System.out.println(multiplication.operation(input1,input2));



    }
}
