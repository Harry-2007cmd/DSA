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
    public ListNode middleNode(ListNode head) {
        
        ListNode temp = head;
        ListNode ans = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int middle = size/2;
        int count =0;
        while(count != middle){
             count++;
            ans = ans.next;
        }  

         return ans;
    }
}