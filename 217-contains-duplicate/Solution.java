class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        boolean duplicate = false;
        for(int i = 0; i < nums.length; i++) {
            if (numMap.get(nums[i]) != null) {
                duplicate = true;
                break;
            }
            numMap.put(nums[i], i);
        }
        return duplicate;
    }
}