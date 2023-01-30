class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> res = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            if(res.contains(nums[i])) {
                res.remove(nums[i]);
            } else {
                res.add(nums[i]);
            }
        }
        int singleNumber = 0;

        for(int num : res){
            singleNumber = num;
        }

        return singleNumber;
    }
}