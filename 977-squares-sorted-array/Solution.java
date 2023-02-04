class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] newNums = new int[nums.length];
        int left = 0, right = nums.length - 1;
        
        for(int i = nums.length - 1; i > -1; i--) {
            if(nums[left] * nums[left] > nums[right] * nums[right]) {
                newNums[i] = nums[left] * nums[left];
                left++;
            } else {
                newNums[i] = nums[right] * nums[right];
                right--;
            }
        }
        return newNums;
    }
}