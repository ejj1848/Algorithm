package com.company;

public class NumberSearch {
    public static void main(String[] args) {
        guessNumber(14);

    }

    private static int guessNumber(int n){
        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + ((high - low)/2);
            int result = mid;
            if (result == 0) {
                return mid;
            }else if(result == 1){
                low = mid +1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
