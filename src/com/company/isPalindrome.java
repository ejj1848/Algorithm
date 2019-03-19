package com.company;

public class isPalindrome {

    public static void main(String[] args) {
        String word = "eye";
        System.out.println(checkWord(word));
        System.out.println(reverseIt(word));
    }

    private static boolean checkWord(String word) {

        String b = "";

        char[] parsedOut = word.toCharArray();
        if (parsedOut[0] != parsedOut[parsedOut.length - 1]) {
            return false;
        }

        int n = word.length();
        for (int i = n - 1; i >= 0; i--) {
            b = b + word.charAt(i);
        }
        return word.equalsIgnoreCase(b);

    }

    private static boolean reverseIt(String word) {
        boolean answer = false;
        StringBuilder reversedOrgiinal = new StringBuilder();
        if (reversedOrgiinal.append(word).reverse().toString().equals(word)) {
            answer = true;
        }
        return answer;
    }

}
