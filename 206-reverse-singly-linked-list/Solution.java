import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head != null) {
            Stack<Integer> stk = new Stack<>();

            while (head != null) {
                stk.push(head.val);
                head = head.next;
            }

            ListNode newHead = null, traversalNode = null;
            while(!stk.isEmpty()) {
                ListNode newNode = new ListNode(stk.pop());
                
                if (newHead == null) {
                    newHead = newNode;
                    traversalNode = newHead;
                } else {
                    traversalNode.next = newNode;
                    traversalNode = traversalNode.next;
                }
            }
            return newHead;

        } else {
            return head;
        }
    }
}