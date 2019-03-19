package AstonInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class interview {

    final static int NUMBER_OF_CARDS_PER_HAND = 5;
    final static int START = 40000;
    final static int END = 21312999;
    final static int INCREMENT = 1;


    public static void main(String[] args) {
//        fizzBuzz();
        System.out.println(generateDeck().toString());
//        System.out.println(generatePokerHand(2).toString());

    }

    private static void fizzBuzz() {
        // todo:

        //   ITERATE FROM 1 TO 100
        //    IF DIV BY 3 PRINT FIZZ
        //    IF DIV BY 5 PRINT BUZZ
        //    IF DIV BY 3 & 5 PRINT FIZZBUZZ
        //    ELSE PRINT THE NUmber

    }

    // the string representing the card should be in the format "Card - Suite"
    // (i.e.  "9-Hearts".... "Ace-Spades", etc.)
    private static List<String> generateDeck() {

        // generate a deck of cards in around 6 lines of code
        String[] suits = "Hearts,Diamonds,Clubs,Spades".split(",");

        String[] vals = "Ace,2,3,4,5,6,7,8,9,10,Jack,Queen,King".split(",");

        List<String> deck = new ArrayList<>();

        //todo: LOGIC TO CREATE THE LIST OF CARD VALUES\

        for(String s: suits){
            for(String v: vals){
                deck.add( s + v);
            }
        }


        return deck;

    }


    private static List<List<String>> generatePokerHand(int numberOfHands) {
        List<List<String>> hands = new ArrayList<List<String>>();

        // generate the deck
        List<String> deck = generateDeck();

        // shuffle the deck
        Collections.shuffle(deck);

        // todo: create X number of hands.

        return hands;
    }
}

