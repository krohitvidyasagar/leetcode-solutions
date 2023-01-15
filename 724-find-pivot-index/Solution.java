class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum, rightSum, pivot;
        leftSum = 0;
        for(int i=0; i < nums.length; i++) {
            rightSum = 0;
            pivot = i + 1;
            while(pivot < nums.length) {
                rightSum += nums[pivot++];
            }

            if (rightSum == leftSum) {
                return i;
            }

            leftSum += nums[i];

        }
        return -1;
    }
}