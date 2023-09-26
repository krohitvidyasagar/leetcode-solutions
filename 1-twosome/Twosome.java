import java.util.HashMap;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
import java.util.Map;

class Twosome {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numPos = new HashMap<>();

        int diff;
        for (int i=0; i<nums.length; i++) {
            diff = target - nums[i];

            if (numPos.containsKey(diff)) {
                return new int[] { i, numPos.get(diff)};
            }
            numPos.put(nums[i], i);
        }

        return new int[] { 0, 0};
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 7};
        int target = 9;

        Twosome obj = new Twosome();

        int[] positions = obj.twoSum(nums, target);

        System.out.println("Indexes= "  + positions[0] + " : " + positions[1]);
    }
}