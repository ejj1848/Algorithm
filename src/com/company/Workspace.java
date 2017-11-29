package com.company;

import java.util.Arrays;
import java.util.HashMap;

public  class Workspace {


            public static void main(String[] args) {
                String[] input = {"be","To be or not to be, that is the question"};

                System.out.println(countOccurrences(input[0],input[1]));
            }

            public static int countOccurrences(String word, String sentence) {
                int ret = 0;
                if(sentence.indexOf(word) != -1)
                    ret = 1 + countOccurrences(word, sentence.substring(sentence.indexOf(word)+word.length()));

                return ret;
            }
        }
