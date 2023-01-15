class Solution {
    public int[] runningSum(int[] nums) {
        int[] newNums = new int[nums.length];
        int totalSum = 0;
        
        for (int i=0; i<nums.length; i++) {
            newNums[i] = nums[i] + totalSum;

            totalSum += nums[i];
        }

        return newNums;
    }
}