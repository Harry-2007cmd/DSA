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
    public ListNode reverseList(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            nums.add(temp.val);
            temp = temp.next;
        }

        ListNode ans = head;
        ListNode dummy = ans;
       int size = nums.size();
        for(int i = size-1;i>=0;i--){
            ans.val = nums.get(i);
             ans  = ans.next;
        } 

return dummy;
    
    }
}