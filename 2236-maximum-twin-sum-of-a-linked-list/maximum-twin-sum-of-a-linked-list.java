/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    public int pairSum(ListNode head) {
        List <Integer> list = new ArrayList<>();
        //iteratting through the linkedlist and adding it in arraylist
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        int i=0,j=list.size()-1;
        int max = Integer.MIN_VALUE;

        while(i<j)
        {
            int sum=list.get(i)+list.get(j);
            max = Math.max(max,sum);
            i=i++;j=j++;
        }
        return max;
    }
}*/
class Solution {
    // Reverse a linked list
public ListNode reverseLL(ListNode head) {

    ListNode prev = null;
    ListNode current = head;

    while (current != null) {

        ListNode next = current.next;
        current.next = prev;

        prev = current;
        current = next;
    }

    return prev;
}
    public int pairSum(ListNode head) {
        ListNode slow=head, fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode p2=reverseLL(slow);
        ListNode p1=head;
        int max= Integer.MIN_VALUE;
         while(p1!=null && p2!=null)
        {
            int sum=p1.val+p2.val;
            max = Math.max(max,sum);
            p1=p1.next;
            p2=p2.next;
        }
        return max;
    }
}
            

