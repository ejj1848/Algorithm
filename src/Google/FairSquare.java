package Google;


//Little John likes palindromes, and thinks them to be fair (which is a fancy word for nice).
// A palindrome is just an integer that reads the same backwards and forwards - so 6, 11 and 121 are all palindromes, while 10, 12, 223 and 2244 are not (even though 010=10,
// we don't consider leading zeroes when determining whether a number is a palindrome).
//
//He recently became interested in squares as well, and formed the definition of a fair and square number - it is a number that is a palindrome and the square of a palindrome at the same time.
// For instance, 1, 9 and 121 are fair and square (being palindromes and squares, respectively, of 1, 3 and 11), while 16, 22 and 676 are not fair and square: 16 is not a palindrome, 22 is not a square,
// and while 676 is a palindrome and a square number, it is the square of 26, which is not a palindrome.
//
//Now he wants to search for bigger fair and square numbers. Your task is, given an interval Little John is searching through,
// to tell him how many fair and square numbers are there in the interval,so he knows when he has found them all.
public class FairSquare {

    public static void main(String[] args) {
        int x = 1;
        int y = 2000;
        System.out.println("Count: " + getFairSquares(x, y));
    }

    private static int getFairSquares(int x, int y) {
        int count = 0;
        int rootX = (int) Math.ceil(Math.sqrt(x));
        int rootY = (int) Math.sqrt(y);

        for (int i = rootX; i <= rootY; i++) {
            if (isPalindrome(i)) {
                int squared = i * i;
                if (isPalindrome(squared)) {
                    System.out.println("Number " + i);
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPalindrome(int n) {
        StringBuilder checker = new StringBuilder(String.valueOf(n));

        return (checker.toString().equals(checker.reverse().toString()));
    }
}
