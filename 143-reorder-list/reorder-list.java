/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null){
            return;
        }

        ListNode slow = head, fast = head.next; 

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
      
        ListNode fh = head; 
        ListNode sh = slow.next; 
        
        slow.next = null; 

        ListNode curr = sh; 
        ListNode prev = null;
        ListNode nextNode = null; 
        
        { 
            while(curr != null){
                nextNode = curr.next;
                curr.next = prev; 
                prev = curr;
                curr = nextNode;
            }
            sh = prev; 
        }

        while(sh != null){ 
            ListNode next1 = fh.next; 
            ListNode next2 = sh.next; 

            fh.next = sh; 
            sh.next = next1; 

            fh = next1; 
            sh = next2; 
        }
    }
}