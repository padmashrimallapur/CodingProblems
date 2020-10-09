package com.company.oct08;

/*
Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums.
 If target exists, then return its index, otherwise return -1.
 */

public class BinarySearch {
        public int search(int[] nums, int target) {
            if (nums == null || nums.length == 0) return -1;

            int mid;
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;

                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }

