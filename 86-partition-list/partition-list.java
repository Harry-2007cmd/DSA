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
    public ListNode partition(ListNode head, int x) {
        ListNode part1 = new ListNode(0);
        ListNode part2 = new ListNode(0);
        ListNode temp1 = part1;
        ListNode temp2 = part2;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                temp1.next = temp;
                temp1 = temp1.next;
            }else{
                temp2.next = temp;
                temp2  = temp2.next;
            }
            temp = temp.next;
        }
    temp2.next = null;
      temp1.next = part2.next;


      return part1.next;

        


    }
}