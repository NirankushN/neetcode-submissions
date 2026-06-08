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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode t = dummy; // fast pointer
        ListNode p = dummy; // slow pointer
        
        for (int i = 0; i < n; i++) {
            t = t.next;
        }
        while (t.next != null) {
            t = t.next;
            p = p.next;
        }
        p.next = p.next.next;
        return dummy.next;
    }
}
