class Solution {
    public void moveZeroes(int[] nums) {
        int temp, left = 0, right = 1;

        while(left < nums.length && right < nums.length) {
            if(nums[left] == 0) {
                while(right < nums.length - 1 && nums[right] == 0) {
                    right++;
                }
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            left++;
            right++;
        }
    }
}