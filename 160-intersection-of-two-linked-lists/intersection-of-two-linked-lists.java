/**
 * Definition for singly-linked list.
 * public clenAss ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getListLength(ListNode head)
    {
        int len=0;
        while(head!=null)
        {
            len++;
            head=head.next;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int lenA = getListLength(headA); 
       int lenB = getListLength(headB);

       while(lenA>lenB)
       {
        
        headA=headA.next;
        lenA--;
       } 
       while(lenA<lenB)
       {
        
        headB=headB.next;
        lenB--;
       } 
       while(headA!=headB)
       {
        headA = headA.next;
        headB = headB.next;
       }
       return headA;
    }
}