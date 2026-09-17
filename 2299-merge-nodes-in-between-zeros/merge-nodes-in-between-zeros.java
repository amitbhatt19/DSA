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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy= new ListNode(-1);
        ListNode ans=dummy;
        ListNode current= head.next;
        int sum=0;
        while(current!=null)
        {
            if(current.val!=0)
            {
                sum=sum+current.val;
            }
            else
            {
                ListNode temp = new ListNode (sum);
                dummy.next=temp;
                dummy=dummy.next;
                sum=0;
            }
            current=current.next;
        }
        return ans.next;
    }
}