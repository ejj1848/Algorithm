package Prep.Poly;

/**
 * Created by Eric.Johnson on 7/13/2017.
 */
public class Fizzbuzz {

    public String evaluate(int number) {

        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {

            return Integer.toString(number);
        }
    }
}
