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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head.next==null)
        {
            return null;
        }
        ListNode slowptr=head;
        ListNode fastptr=head;
        ListNode pre=slowptr;
        

        while(fastptr!=null && fastptr.next!=null)
        {
            pre=slowptr;
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        pre.next=pre.next.next;
        return head;
    }

    
}