import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        int remainder;

        int[] positions = new int[2];

        for(int i=0; i < nums.length; i++) {
            remainder = target - nums[i];
            
            if (numToIndexMap.get(remainder) != null) {
                positions[0] = numToIndexMap.get(remainder);
                positions[1] = i;

                return positions;
            } else {
                numToIndexMap.put(nums[i], i);
            }
        }

        positions[0] = 0;
        positions[1] = 0;
        return positions;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 7};
        int target = 9;

        Solution obj = new Solution();

        int[] positions = obj.twoSum(nums, target);

        System.out.println("Indexes= "  + positions[0] + " : " + positions[1]);
    }
}