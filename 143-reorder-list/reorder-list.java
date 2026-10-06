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
        
       ListNode fast = head;
       ListNode slow = head;

       while(fast !=null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
       }
    

       ListNode second = slow.next;
       slow.next = null;

        ListNode prev = null;
       while(second !=null){
        ListNode next = second.next;
        second.next= prev;
        prev = second;
        second = next;
       }
      
      ListNode first= head;

     while(prev!=null){
        ListNode firstNext= first.next;
        ListNode revNext = prev.next;
  
        first.next = prev;
        prev.next = firstNext;

        first = firstNext;
        prev = revNext;

     }



    }
}