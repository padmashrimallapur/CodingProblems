package com.company.Oct03;

import java.util.HashMap;
import java.util.Map;
/*
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i, j < nums.length
i != j
a <= b
b - a == k
 */

public class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        if(nums.length == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=nums.length-1; i>=0; i--){
            for(int j=0; j<nums.length; j++){
                if( j!=i && (nums[i] - nums[j] == k)){
                    map.putIfAbsent(nums[i], nums[j]);
                    break;
                }
            }
        }
        return map.size();
    }
}
