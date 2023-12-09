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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null)
            return head;

        ListNode dummy = new ListNode(0, head);
        ListNode handler = dummy.next;

        while (handler != null && handler.next != null){
            ListNode tmp = new ListNode(
                GCD(handler.val, handler.next.val),
                handler.next
            );
            handler.next = tmp;
            handler = handler.next.next;
        }

        return dummy.next;
    }

    private int GCD (int a, int b){
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}