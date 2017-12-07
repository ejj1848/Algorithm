package com.company;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import sun.plugin.javascript.navig.Array;

import java.util.*;
import java.util.stream.Collectors;

public  class Workspace {


    static int[] nums = {1,1,2,2,2,2,2,2};

    public static void main(String[] args) {
        if(nums.length == 0){
            System.out.println("0");
        }
        int i = 0;
        for(int j = 1; j <nums.length; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i]= nums[j];
            }
        }
        System.out.println(i + 1);


        createList(nums);
       // lengthOfArray();
    }


    private static  List<Integer> createList(int[] nums){
      //  List<Integer> myList = new ArrayList<Integer>(Arrays.asList(nums));

        return null;
    }
    private static void lengthOfArray(List<Integer> integerList){

        integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(integerList.size());



    }
}
