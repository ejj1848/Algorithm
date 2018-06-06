package Prep.Poly;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Created by Eric.Johnson on 7/13/2017.
 */
public class Fizzbuzz {

    public static void main(String[] args) {

        System.out.println(fizzBuzzInJava8(1));

        IntStream.rangeClosed(1, 21).mapToObj(

                i -> i % 3 == 0 ?
                        (i % 5 == 0 ? "Fizzbuzz" : "Fizz") :
                        (i % 5 == 0 ? "Buzz" : i)
        )
                .forEach(System.out::println);

    }

    private static String fizzBuzzInJava8(int number) {
        String result = Optional.of(number)
                .map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : ""))
                .get();
        return result.isEmpty() ? Integer.toString(number) : result;
    }

    private static String fizzBuzzSolutionJava8(int input) {
        return Optional.of(input).map(i -> {
            if (i % 15 == 0) {
                return "FizzBuzz";
            } else if (i % 3 == 0) {
                return "Fizz";
            } else if (i % 5 == 0) {
                return "Buzz";
            } else {
                return Integer.toString(i);
            }
        })
                .get();
    }

}
