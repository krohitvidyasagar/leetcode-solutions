class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productNums = new int[nums.length];

        int prefix = 1;
        for(int i=0; i<nums.length; i++) {
            productNums[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for(int j=nums.length-1; j>=0; j--) {
            productNums[j] *= postfix;
            postfix *= nums[j];
        }

        return productNums;
    }
}