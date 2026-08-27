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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode ans  = new ListNode(-1);
        ListNode dummy = ans;
        ListNode temp = head;

        while(temp.next!=null){
            if(temp.val!= temp.next.val){
                ans.next =temp;
                ans = ans.next;
                temp = temp.next;
            }else{
                temp = temp.next;
            }
        }
        ans.next = temp;
        return dummy.next;
    }
}