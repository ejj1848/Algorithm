package com.company;

public class Robber {

    public static void main(String[] args) {
    int[] nums = {1,99,100,99,1,1,99,1,200};
        System.out.println(calculateRobber(nums));

    }

    private static int calculateRobber(int[] nums) {

        int a = 0;
        int b = 0;
        for(int n: nums){
            int temp = a;
            a = Math.max(a,b);
            b = n + temp;
        }


        return Math.max(a,b);

    }

}
