package tests

import Prep.Poly.Fizzbuzz
import spock.lang.Specification

/**
 * Created by Eric.Johnson on 7/13/2017.
 */
class FizzbuzzSpecs extends Specification {

    def fizzbuzz

    def setup() {
        fizzbuzz = new Fizzbuzz()
    }

    def "Evaluating 1 should return 1 "() {
        when:
            def result = fizzbuzz.evaluate(1)
        then:
            result == "1"
    }

    def "Evaluating 2 should return 2 "() {
        when:
            def result = fizzbuzz.evaluate(2)
        then:
            result == "2"
    }

    def "3 should return Fizz"() {
        when:
            def result = fizzbuzz.evaluate(3)
        then:
            result == "Fizz"
    }

    def "5 should return Buzz"() {
        when:
            def result = fizzbuzz.evaluate(5)
        then:
            result == "Buzz"
    }

    def "6 should return Fizz"() {
        when:
            def result = fizzbuzz.evaluate(6)
        then:
            result == "Fizz"
    }

    def "10 should return Buzz"() {
        when:
            def result = fizzbuzz.evaluate(10)
        then:
            result == "Buzz"
    }

    def "15 should return FizzBuzz"() {
        when:
            def result = fizzbuzz.evaluate(15)
        then:
            result == "FizzBuzz"
    }

    def "30 should return FizzBuzz"() {
        when:
            def result = fizzbuzz.evaluate(30)
        then:
            result == "FizzBuzz"
    }

}
