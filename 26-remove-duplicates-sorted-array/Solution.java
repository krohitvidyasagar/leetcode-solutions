import java.util.Set;
import java.util.HashSet;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        Set<Integer> set = new HashSet<>(); 

        for(int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int[] expectedNums = {1, 2};

        Solution s1 = new Solution();
        int k = s1.removeDuplicates(nums);

        if (k == expectedNums.length) {
            System.out.println("Correct length");
        }

        for (int i = 0; i < k; i++) {
            if (nums[i] != expectedNums[i]) {
                System.out.println("Wrong output");
                break;
            }
        }

        System.out.println("Correct output");

    }
}