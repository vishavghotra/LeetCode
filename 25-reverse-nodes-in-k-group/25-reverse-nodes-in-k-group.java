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
     public ListNode reverseKGroup(ListNode head, int k) {
    
          if (head == null)
      return null;
         if(k == 0 || k == 1)
             return head;

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = dummy;
    while (current != null) {
      ListNode node = current;
      for (int i = 0; i < k; i++) {
        node = node.next;
        if (node == null) {
          return dummy.next;
        }

      }

      ListNode prev = null;
      ListNode curr = current.next;

      ListNode next = null;
      for (int i = 0; i < k; i++) {
        ListNode replace = curr.next;
        curr.next = prev;
        prev = curr;
        curr = replace;

      }
      ListNode tail = current.next;
      current.next = prev;
      tail.next = curr;
      current = tail;


    }
    return dummy.next;

         
     }
	  
	  
}