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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int result=0;
       
        ListNode head=new ListNode();
        ListNode cursor=head;
   
        int carry=0;
        while(l1!=null || l2!=null){
            if(l1!=null){
                result+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                result+=l2.val;
                l2=l2.next;
            }
            result+=carry;
            cursor.next=new ListNode(result%10);
            carry=result/10;
            result=0;
            cursor=cursor.next;
            
        }
        if(carry!=0)
            cursor.next=new ListNode(carry);
        
        return head.next;

    
    
    
    }
    
}