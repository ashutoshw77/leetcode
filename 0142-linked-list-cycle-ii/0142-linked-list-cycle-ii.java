/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null ||  head.next==null ) return null;
        ListNode slow = head;
        ListNode fast =head;
        do{
            slow=slow.next;
            fast=fast.next.next;
            
        }while(slow!=fast && fast!=null && fast.next!=null);
      
        fast=head;
        
        while(slow!=fast  && slow!=null){
          slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}