class Solution {
    public int searchInsert(int[] nums, int target) {
        int position = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            } else if (nums[i] < target){
                position = i;
            }
        }

        if (position == Integer.MIN_VALUE) {
            return 0;
        }

        return ++position;   
    }
}