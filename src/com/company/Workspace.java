package com.company;


public  class Workspace {


    private static int[] nums = {1, 1, 2, 2, 2, 2, 2, 2};

    public static void main(String[] args) {
        if (nums.length == 0) {
            System.out.println("0");
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i + 1);


    }

}
