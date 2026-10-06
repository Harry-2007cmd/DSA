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
    public ListNode oddEvenList(ListNode head) {

        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode tempEven = even;
        ListNode tempOdd  =odd;

        int i =1;
        ListNode temp = head;
        while(temp !=null){
            if(i%2==0){
                even.next = temp;
                even = even.next;
            }else{
                odd.next = temp;
                odd = odd.next;
            }
            temp = temp.next;
            i++;
        }
        even.next = null;
        odd.next = tempEven.next;
        
 return tempOdd.next;
    }
}