/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arrList = new ArrayList<>();

        while(head != null) {
            arrList.add(head.val);
            head = head.next;
        }

        int left = 0, right = arrList.size() - 1;

        while(left <= right) {
            if(arrList.get(left) != arrList.get(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}