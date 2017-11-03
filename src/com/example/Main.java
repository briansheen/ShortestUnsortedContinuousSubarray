package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 3, 2, 4};
        System.out.println(findUnsortedSubarray(nums));
    }

    public static int findUnsortedSubarray(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        for(int i : nums){
            numsList.add(i);
        }
        Collections.sort(numsList);
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i = 0; i < nums.length; ++i){
           if(nums[i]!=numsList.get(i) && firstIndex==-1){
               firstIndex = i;
           }
           if(nums[i]!=numsList.get(i)){
               lastIndex = i;
           }
        }
        if(firstIndex == -1 && firstIndex==lastIndex){
            return 0;
        } else {
            return (lastIndex - firstIndex + 1);
        }
    }
}
