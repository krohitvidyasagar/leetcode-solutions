class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> res  = new HashSet<>();

        for(int i=0; i<nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            int x = nums[i];
            while(l < r) {
                if (x + nums[l] + nums[r] == 0 && i != l && i != r && l != r) {
                    res.add(Arrays.asList(x,nums[l++],nums[r--]));
                } else if (x + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
       return new ArrayList<>(res);
    }
}