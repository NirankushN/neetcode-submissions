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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        if(head.next.next==null){
            ListNode curr=head.next;
            head.next.next=head;
            head.next=null;
            head=curr;
            return head;
        }else{
            ListNode prev=head;
            ListNode curr=head.next;
            while(true){
                if(curr==null){
                    head=prev;
                    break;
                }
                if(prev==head){
                    prev.next=null;
                }
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return head;
        }
    }
}
