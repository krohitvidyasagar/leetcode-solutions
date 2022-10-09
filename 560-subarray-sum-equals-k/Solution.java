/*
Given an array of integers a, your task is to find how many of its contiguous subarrays of length m contain a pair of integers 
with a sum equal to target.

A subarray is a contiguous non-empty sequence of elements within an array.
*/

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int m, int target) {
        int remainder, currentNumber;
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i <= nums.length - m; i++) {
            
            for(int j=0; j < m; j++) {
                
                currentNumber = nums[i+j];
                remainder = target - currentNumber;
                
                if (!map.isEmpty() && map.get(remainder) != null) {
                    counter++;
                    break;
                }
                

                map.put(currentNumber, (i+j));
            }
            map.clear();
        }

        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 5, 3, 5, 8, 5, 1, 7};

        Solution obj = new Solution();

        int subArrayLength = 4, target = 10;

        int counter = obj.subarraySum(arr, subArrayLength, target);

        System.out.println("Number of subarrays with length: " + subArrayLength + " and sum equal to target: " + target +
        " is  equal to: " + counter);
    }
}