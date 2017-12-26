package com.company;


public class Workspace {

    public static void main(String[] args) {

        int[] nums = {1,99,100,99,1,1,99,1,200};
        System.out.println(robber(nums));


    }

    private static int robber(int[] nums){

        int robOne = 0;
        int robTwo = 0;
        int hold = 0;
        for(int n: nums){
           hold = robOne;
           robOne = Math.max(robOne,robTwo);
           robTwo = n +hold;

        }

        return Math.max(robOne,robTwo);
    }
}