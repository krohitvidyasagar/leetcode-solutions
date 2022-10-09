import java.util.HashMap;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
import java.util.Map;

class Twosome {
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

        Twosome obj = new Twosome();

        int[] positions = obj.twoSum(nums, target);

        System.out.println("Indexes= "  + positions[0] + " : " + positions[1]);
    }
}