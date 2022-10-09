
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode head = null;
        int value1, value2;

        ListNode current;

        int counter = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                value1 = l1.val;
            } else {
                value1 = Integer.MAX_VALUE;
            }

            if (l2 != null) {
                value2 = l2.val;
            } else {
                value2 = Integer.MAX_VALUE;
            }

            System.out.println("Value1: " + value1 + " Value2: " + value2);

            if (value1 < value2) {
                current = new ListNode(value1);
                l1 = l1.next;
            } else {
                current = new ListNode(value2);
                l2 = l2.next;
            }

            if (l3 == null) {
                System.out.println("Empty List");
                head = current;
                l3 = current;
            } else {
                l3.next = current;
                l3 = l3.next;
            }

            counter++;
        }

        System.out.println("Counter: " + counter);

        return head;
    }
    
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        
        ListNode a2 = new ListNode(2);
        a1.next = a2;

        ListNode a3 = new ListNode(4);
        a2.next = a3;

        ListNode b1 = new ListNode(1);
        
        ListNode b2 = new ListNode(3);
        b1.next = b2;

        ListNode b3 = new ListNode(4);
        b2.next = b3;

        Solution obj = new Solution();

        ListNode answer = obj.mergeTwoLists(a1, b1);

        System.out.print("Solution: ");

        while(answer != null) {
            System.out.print(answer.val + " ");
            answer = answer.next;
        }

    }
}
