package tests

import Prep.Poly.Calculator
import spock.lang.Specification

/**
 * Created by Eric.Johnson on 7/12/2017.
 */
class CalcSpecs extends Specification {


    def calculator

    def setup(){
        calculator = new Calculator()
    }

    def "1+1 = 2"(){
        when:
            def result = calculator.add(1,1)
        then:
            result == 2

    }
    def "1-1 = 0"(){
        when:
            def result2 = calculator.subtract(1,1)
        then:
            result2 == 0
    }
    def "2*2 = 4"(){
        when:
            def result3 = calculator.multiply(2,2)
        then:
            result3 == 4
    }

}
