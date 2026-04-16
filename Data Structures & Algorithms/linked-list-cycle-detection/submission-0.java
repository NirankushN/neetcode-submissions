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

// this can be solve using the fast and slow pointers
class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null || head.next.next == null){
            return false;
        }
        ListNode slow=head.next;
        ListNode fast=head.next.next;
        while(slow!=null || fast !=null){
            if(slow==fast){
                return true;
            }
            if(slow.next!=null && fast.next!=null && fast.next.next != null){
                slow=slow.next;
                fast=fast.next.next;
            }else{
                return false;
            }
        }
        return false;
    }
}
