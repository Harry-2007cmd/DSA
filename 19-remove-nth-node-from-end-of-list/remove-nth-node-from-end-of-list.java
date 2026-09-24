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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode ans = new ListNode(0);
    ans.next = head;
    ListNode p1 = ans;
    ListNode p2 = ans;
    if(head == null || head.next ==null) return null;
        for(int i =0;i<n;i++){
            p2 = p2.next;
        }
    while(p2.next !=null){
      p2 = p2.next;
      p1 = p1.next;
    }
    p1.next = p1.next.next;

return ans.next;
    }
}