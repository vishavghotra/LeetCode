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
    public void reorderList(ListNode head) {
  if (head == null)
      return;
    ListNode cursor = new ListNode(0);
    cursor.next = head;
    ListNode first = head;
    ListNode second = head.next;
    while (first != null && second != null) {
      if (second.next == null)
        return;
      ListNode replace = second;
      while (second.next.next != null) {
        second = second.next;
      }
      first.next = second.next;
      second.next = null;
      first.next.next = replace;
      cursor = first.next;
      first = replace;
      second = replace.next;

    }

		  
	  }
    }
