class Solution {
    public boolean isPalindrome(ListNode head) {
         Stack<Integer> stack = new Stack<>();

        //  ListNode temp = head;
        //  while(temp!=null){
        //     stack.push(temp.val);
        //     temp = temp.next;
        //  }

        //  temp = head;
        //  while(temp!=null){
        //     if(temp.val != stack.pop()){
        //         return false;
        //     }
        //     temp = temp.next;
        //  }
        //  return true;
         
         ListNode slow = head;
         ListNode fast = head;

         while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
         }

        if(fast!=null){
             slow = slow.next;
        }

         ListNode rev = null;
         while(slow!=null){
           
           ListNode next = slow.next;
           slow.next = rev;
           rev = slow;
           slow = next;
         }

       ListNode start = head;
       while(rev !=null){
        if(rev.val != start.val){
            return false;
        }
        rev = rev.next;
        start = start.next;
       }
      return true;
    }
}
